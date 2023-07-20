package cloud.paolu.xpanel.controller;

import cloud.paolu.xpanel.entity.CommonResult;
import cloud.paolu.xpanel.service.NodeService;
import cloud.paolu.xpanel.service.XrayService;
import cloud.paolu.xpanel.util.XrayUrlUtil;
import cloud.paolu.xray.app.proxyman.command.AddInboundRequest;
import cloud.paolu.xray.app.proxyman.command.AddInboundResponse;
import cloud.paolu.xray.app.proxyman.command.AlterInboundRequest;
import cloud.paolu.xray.app.proxyman.command.AlterInboundResponse;
import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.casbin.casdoor.entity.CasdoorUser;
import org.casbin.casdoor.service.CasdoorUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static cloud.paolu.xpanel.entity.CommonResult.ok;

@Slf4j
@RestController
public class XrayController {

    @Resource
    private XrayService xrayService;

    @Resource
    private NodeService nodeService;

    @Resource
    private CasdoorUserService casdoorUserService;

    @GetMapping("addXrayUser")
    public CommonResult<AlterInboundResponse> addXrayUser() {
        AlterInboundRequest request = xrayService.addUser("proxy",0,"wangxingrui1997@gmail.com","60467418-8f91-4f25-9686-ff0b7fc1cf73",0);
        AlterInboundResponse response = xrayService.alterInboudBlocking(request, "10.10.10.15:10085");
        return ok(response);
    }

    @GetMapping("addXrayInbound")
    public CommonResult<AddInboundResponse> addXrayInbound() {
        AddInboundRequest request = xrayService.addInbound("proxy1",12345,"tcp");
        AddInboundResponse response = xrayService.addInboundBlocking(request, "10.10.10.15:10085");
        return ok(response);
    }

    @GetMapping("sub")
    public String sub() {
        StringBuilder builder = new StringBuilder();
        try {
            CasdoorUser user = casdoorUserService.getUser("wangxingrui");
            nodeService.list().forEach(node -> builder.append(XrayUrlUtil.jsonUrl(node, user)).append(StrUtil.C_LF));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Base64.encode(builder.toString());
    }

    @GetMapping("push")
    public void push(@RequestParam String endpoint) {
        try {
            List<CasdoorUser>  users = Arrays.stream(casdoorUserService.getUsers()).toList();
            AddInboundRequest addInboundRequest = xrayService.addInbound("proxy",12345,"tcp");
            AddInboundResponse addInboundResponse = xrayService.addInboundBlocking(addInboundRequest, endpoint);
            log.info(addInboundResponse.toString());
            users.forEach(user -> {
                AlterInboundRequest alterInboundRequest = xrayService.addUser("proxy",0,user.getEmail(),user.getId(),0);
                AlterInboundResponse alterInboundResponse = xrayService.alterInboudBlocking(alterInboundRequest, endpoint);
                log.info(alterInboundResponse.toString());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
