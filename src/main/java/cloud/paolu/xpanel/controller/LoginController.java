package cloud.paolu.xpanel.controller;

import cloud.paolu.xpanel.entity.CommonResult;
import cloud.paolu.xray.app.proxyman.ReceiverConfig;
import cloud.paolu.xray.app.proxyman.command.AddInboundRequest;
import cloud.paolu.xray.app.proxyman.command.AddInboundResponse;
import cloud.paolu.xray.app.proxyman.command.HandlerServiceGrpc;
import cloud.paolu.xray.app.stats.command.StatsServiceGrpc;
import cloud.paolu.xray.app.stats.command.SysStatsRequest;
import cloud.paolu.xray.app.stats.command.SysStatsResponse;
import cloud.paolu.xray.common.serial.TypedMessage;
import cloud.paolu.xray.core.InboundHandlerConfig;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.casbin.casdoor.entity.CasdoorUser;
import org.casbin.casdoor.exception.CasdoorAuthException;
import org.casbin.casdoor.service.CasdoorAuthService;
import org.casbin.casdoor.service.CasdoorUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static cloud.paolu.xpanel.entity.CommonResult.error;
import static cloud.paolu.xpanel.entity.CommonResult.ok;
import static cloud.paolu.xpanel.exception.enums.GlobalErrorCodeConstants.UNAUTHORIZED;

@RestController
public class LoginController {

    @Value("${casdoor.callback}")
    private String casdoorCallbackUrl;
    @Resource
    private CasdoorAuthService casdoorAuthService;

    @Resource
    private CasdoorUserService casdoorUserService;

    @GetMapping("/currentUser")
    public CommonResult<Object> getCurrentUser(HttpSession session) {
        CasdoorUser user = (CasdoorUser) session.getAttribute("casdoorUser");
        if (user == null) {
            return error(UNAUTHORIZED);
        } else {
            return ok(user);
        }
    }

    @GetMapping("/userList")
    public CommonResult<CasdoorUser[]> userList() throws IOException {
        return ok(casdoorUserService.getUsers());
    }

//    @GetMapping("/sysStats")
//    public CommonResult<Object> sysStats() throws IOException {
//        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget("localhost:10085").usePlaintext().build();
//        StatsServiceGrpc.StatsServiceBlockingStub blockingStub = StatsServiceGrpc.newBlockingStub(managedChannel);
//        SysStatsResponse sysStatsResponse = blockingStub.getSysStats(SysStatsRequest.newBuilder().build());
//        HandlerServiceGrpc.HandlerServiceBlockingStub handlerServiceBlockingStub = HandlerServiceGrpc.newBlockingStub(managedChannel);
//        AddInboundResponse addInboundResponse = handlerServiceBlockingStub
//                .addInbound(
//                        AddInboundRequest.newBuilder()
//                                .setInbound(
//                                        InboundHandlerConfig
//                                                .newBuilder()
//                                                .setTag("")
//                                                .setReceiverSettings()
//                                                .build())
//                                .build());
//        return ok(sysStatsResponse.toString());
//    }

    @RequestMapping("login")
    public String login() {
        return "redirect:" + casdoorAuthService.getSigninUrl("http://localhost:8080/callback");
    }

    @RequestMapping("callback")
    public String callback(String code, String state, HttpSession session) {
        String token = "";
        CasdoorUser user = null;
        try {
            token = casdoorAuthService.getOAuthToken(code, state);
            user = casdoorAuthService.parseJwtToken(token);
        } catch (CasdoorAuthException e) {
            e.printStackTrace();
        }
        session.setAttribute("casdoorUser", user);
        return "redirect:/";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.setAttribute("casdoorUser", null);
        return "login";
    }
}
