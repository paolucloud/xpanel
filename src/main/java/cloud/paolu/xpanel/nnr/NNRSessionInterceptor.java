package cloud.paolu.xpanel.nnr;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;

import jakarta.annotation.Resource;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static org.springframework.http.HttpHeaders.COOKIE;

@Component
public class NNRSessionInterceptor extends BasePathMatchInterceptor {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private NNRProperties nnrProperties;

    @Override
    public Response doIntercept(Chain chain) throws IOException {
        String key = "nnr:" + nnrProperties.getName();
        Request request = chain.request();
        Request newRequest = request.newBuilder().addHeader(COOKIE, "ssid="+stringRedisTemplate.opsForValue().get(key)).build();
        return chain.proceed(newRequest);
    }
}
