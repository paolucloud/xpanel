package cloud.paolu.xpanel.pfgo;

import com.github.lianjiatech.retrofit.spring.boot.interceptor.BasePathMatchInterceptor;
import okhttp3.Response;

import java.io.IOException;

public class PFGOSessionInterceptor extends BasePathMatchInterceptor {
    @Override
    protected Response doIntercept(Chain chain) throws IOException {
        return null;
    }
}
