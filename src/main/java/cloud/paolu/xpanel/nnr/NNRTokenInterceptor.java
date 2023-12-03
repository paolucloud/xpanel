package cloud.paolu.xpanel.nnr;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpHeaders.COOKIE;

@Component
public class NNRTokenInterceptor extends BasePathMatchInterceptor {
    @Override
    public Response doIntercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request newRequest = request.newBuilder()
                .addHeader(CONTENT_TYPE,"application/json")
                .addHeader("token", "2e7bb01a-4a11-4f09-b441-52a1d363a515").build();
        return chain.proceed(newRequest);
    }
}
