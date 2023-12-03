package cloud.paolu.xpanel.nnr;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;

import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static org.springframework.http.HttpHeaders.COOKIE;

@Component
public class NNRSessionInterceptor extends BasePathMatchInterceptor {
    @Override
    public Response doIntercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request newRequest = request.newBuilder().addHeader(COOKIE, "ssid=c3f8d2ac-9435-4ca3-b806-818a3964f423").build();
        return chain.proceed(newRequest);
    }
}
