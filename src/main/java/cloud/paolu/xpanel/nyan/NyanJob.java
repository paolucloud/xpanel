package cloud.paolu.xpanel.nyan;

import cloud.paolu.xpanel.nyan.pojo.DeviceGroup;
import cloud.paolu.xpanel.nyan.pojo.LoginReq;
import cloud.paolu.xpanel.nyan.pojo.NyanResp;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Slf4j
@Component
public class NyanJob {

    public static final String NYAN_SERVERS_REDIS_KEY = "nyan:%s:servers";

    public static final String DEVICE_GROUP_TYPE_INBOUND = "DeviceGroupType_Inbound";
    public static final String DEVICE_GROUP_TYPE_OUTBOUND_BY_SITE = "DeviceGroupType_OutboundBySite";
    @Resource
    private NyanServiceProvider provider;
    @Resource
    private NyanProperties nyanProperties;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Scheduled(cron = "${nyan.cron}")
    public void getDeviceGroup() {
        provider.getAllServices().forEach((s, nyanService) -> {
            log.info("开始获取Nyan面板：{} 的服务器列表", s);
            try {
                NyanResp<List<DeviceGroup>> resp = nyanService.getDeviceGroup().execute().body();
                if (CollUtil.isNotEmpty(resp.getData())) {
                    List<DeviceGroup> list = resp.getData();
                    String key = String.format(NYAN_SERVERS_REDIS_KEY, s);
                    redisTemplate.opsForValue().set(key, list);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private List<DeviceGroup> getInboundDeviceGroup(String name) {
        List<DeviceGroup> list = (List<DeviceGroup>) redisTemplate.opsForValue().get(String.format(NYAN_SERVERS_REDIS_KEY, name));
        return list.stream().filter(deviceGroup -> DEVICE_GROUP_TYPE_INBOUND.equals(deviceGroup.getType())).toList();
    }

    private List<DeviceGroup> getOutboundDeviceGroup(String name) {
        List<DeviceGroup> list = (List<DeviceGroup>) redisTemplate.opsForValue().get(String.format(NYAN_SERVERS_REDIS_KEY, name));
        return list.stream().filter(deviceGroup -> DEVICE_GROUP_TYPE_OUTBOUND_BY_SITE.equals(deviceGroup.getType())).toList();
    }

    private void addRules(String name) {

    }



}
