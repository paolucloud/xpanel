package cloud.paolu.xpanel;

import cloud.paolu.xpanel.nyan.NyanServiceProvider;
import cloud.paolu.xpanel.nyan.pojo.Forward;
import cloud.paolu.xpanel.nyan.pojo.NyanResp;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class NyanTest {

    @Resource
    private NyanServiceProvider provider;

    @Test
    public void test() {
        provider.getAllServices().forEach(((s, nyanService) -> {
            try {
                Response<NyanResp<List<Forward>>> resp = nyanService.forward().execute();
                NyanResp nyanResp = resp.body();
                List<Forward> list = (List<Forward>) nyanResp.getData();
                System.out.println("List<Forward>" + list);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
    }
}
