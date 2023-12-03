package cloud.paolu.xpanel;

import cloud.paolu.xpanel.nnr.pojo.NNRApiResp;
import cloud.paolu.xpanel.nnr.pojo.NNRRule;
import cloud.paolu.xpanel.nnr.pojo.NNRServer;
import cloud.paolu.xpanel.nnr.pojo.RulesReq;
import cloud.paolu.xpanel.nnr.service.NNRService;
import cn.hutool.json.JSONObject;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Slf4j
@SpringBootTest
public class NNRTest {

    @Resource
    private NNRService nnrService;

    @Test
    public void servers() throws IOException {
        Response<NNRApiResp<List<NNRServer>>> resp = nnrService.getServers().execute();
        System.out.println(resp.body());
    }

    @Test
    public void rules() throws IOException {
        Response<NNRApiResp<List<NNRRule>>> resp = nnrService.getRules().execute();
        System.out.println(resp.body());
    }

    @Test
    public void check() throws IOException {

        Response<JSONObject> resp = nnrService.checkRules(new RulesReq("59a6a338391a16b8f6199217a57e38ca")).execute();
        System.out.println(resp.body());
    }

    @Test
    public void delete() throws IOException {
        System.out.println(String.valueOf(nnrService.delRule(new RulesReq("14a6ed4ef30d0660f595447e993dc535")).execute().body()));
    }
}
