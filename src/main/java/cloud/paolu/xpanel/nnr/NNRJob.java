package cloud.paolu.xpanel.nnr;

import cloud.paolu.xpanel.entity.Node;
import cloud.paolu.xpanel.entity.Server;
import cloud.paolu.xpanel.nnr.pojo.*;
import cloud.paolu.xpanel.nnr.service.NNRService;
import cloud.paolu.xpanel.service.NodeService;
import cloud.paolu.xpanel.service.ServerService;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class NNRJob {
    public static final String NNR_SERVERS_REDIS_KEY = "nnr:servers";
    public static final String NNR_RULES_REDIS_KEY = "nnr:rules";

    @Resource
    private NNRService nnrService;

    @Resource
    private NNRProperties nnrProperties;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private NodeService nodeService;

    @Resource
    private ServerService serverService;

    @Scheduled(cron = "0 0 0 ? * MON") // 每周一凌晨执行
    @PostConstruct
    public void getCookie() throws IOException {
        log.info("开始获取NNR cookie");
        NNRResp<String> resp = nnrService.login(new LoginReq(nnrProperties.getName(), nnrProperties.getPasswd())).execute().body();
        if (resp != null && resp.getStatus()) {
            String key = "nnr:" + nnrProperties.getName();
            stringRedisTemplate.opsForValue().set(key, resp.getData());
            stringRedisTemplate.expire(key, 10, TimeUnit.DAYS); // 10天过期
            log.info("用户 {} 登录成功，响应结果为：{}", nnrProperties.getName(), resp);
        }
    }

    @Scheduled(cron = "${nnr.cron}") // 每天执行一次
    public void getServers() throws IOException {
        log.info("开始获取NNR servers");
        List<NNRServer> servers = Objects.requireNonNull(nnrService.getServers().execute().body()).getData();
        redisTemplate.opsForValue().set(NNR_SERVERS_REDIS_KEY, servers);
    }

    @Scheduled(cron = "${nnr.cron}") // 每小时执行一次
    public void updateRules() throws IOException {
        getRules();
        addRules();
        checkRules();
    }

    public void getRules() throws IOException {
        log.info("开始获取NNR rules");
        List<NNRRule> rules = Objects.requireNonNull(nnrService.getRules().execute().body()).getData();
        redisTemplate.opsForValue().set(NNR_RULES_REDIS_KEY, rules);
    }

    public void checkRules() {
        List<NNRRule> rules = (List<NNRRule>) redisTemplate.opsForValue().get(NNR_RULES_REDIS_KEY);
        if (CollUtil.isNotEmpty(rules)) {
            rules.forEach(rule -> {
                log.info("开始检查NNR 规则： {}", rule.getName());
                try {
                    JSONObject checkResp = nnrService.checkRules(new RulesReq(rule.getRid())).execute().body();
                    log.info("规则名称：{}，检查结果：{}", rule.getName(), checkResp);
                    if (!checkResp.getBool("status")) {
                        log.error("NNR rules 状态异常：{}，删除记录", rule.getName());
                        deleteNodeByRid(rule.getRid());
                    }
                } catch (Exception e) {
                    log.error("请求异常：{}", e.getMessage());
                }
            });
        }
    }

    private void deleteNodeByRid(String rid) {
        QueryWrapper<Node> wrapper = new QueryWrapper<>();
        wrapper.eq("rule_id", rid);
        nodeService.remove(wrapper);
        try {
            log.info(String.valueOf(nnrService.delRule(new RulesReq(rid)).execute().body()));
        } catch (IOException e) {
            log.error("删除NNR rule失败： rid = {}", rid);
        }
    }

    public void addRules() {

        List<NNRServer> nnrServers = (List<NNRServer>) redisTemplate.opsForValue().get(NNR_SERVERS_REDIS_KEY);
        List<NNRRule> nnrRules = (List<NNRRule>) redisTemplate.opsForValue().get(NNR_RULES_REDIS_KEY);
        if (CollUtil.isNotEmpty(nnrServers)) {
            List<Server> servers = serverService.list();
            servers.forEach(server -> {
                List<NNRServer> filteredServers = nnrServers.stream()
                        .filter(nnrServer -> {
                                    boolean b = nnrServer.getMf() < 5 &&
                                            StrUtil.containsAll(nnrServer.getName(), server.getLocation().split(","));
                                    String condition = server.getConditionn();
                                    if (StrUtil.isNotBlank(condition)) {
                                        b = b && StrUtil.containsAnyIgnoreCase(nnrServer.getDetail(), condition.split(","));
                                    }
                                    return b;
                                }
                        ).toList();
                List<NNRRule> filteredRules = nnrRules.stream()
                        .filter(nnrRule -> StrUtil.equals(nnrRule.getRemote(), server.getIp())).toList();
                List<NNRServer> difference = filteredServers.stream()
                        .filter(nnrServer -> filteredRules.stream()
                                .noneMatch(nnrRule -> nnrRule.getSid().equals(nnrServer.getSid()))).toList();
                addRulesByNNRServers(difference, server);
            });
        }
    }

    private void addRulesByNNRServers(List<NNRServer> nnrServers, Server server) {
        nnrServers.forEach(nnrServer -> {
            AddRuleReq req = new AddRuleReq();
            req.setSid(nnrServer.getSid());
            req.setRemote(server.getIp());
            req.setRport(server.getXrayEndpoint()); // TODO 暂时写死
            req.setType("tcp");

            log.info("开始添加 NNR Rule：{}", req);
            try {
                AddRuleResp resp = Objects.requireNonNull(nnrService.addRule(req).execute().body()).getData();
                String[] hosts = resp.getHost().split(",");
                for (int i = 0; i < hosts.length; i++) {
                    Node node = new Node();
                    node.setName(server.getName() + "[" + nnrServer.getName() + "]-" + (i + 1));
                    node.setPort(resp.getPort());
                    node.setProtocol("vmess"); // TODO 写死
                    node.setConnAddr(hosts[i]);
                    node.setConnPort(resp.getPort());
                    node.setHidden(false);
                    node.setRuleId(resp.getRid());
                    node.setServerId(server.getId());
                    nodeService.save(node);
                }

            } catch (IOException e) {
                log.error("添加 NNR Rule 失败：{}", req);
            }
        });
    }
}
