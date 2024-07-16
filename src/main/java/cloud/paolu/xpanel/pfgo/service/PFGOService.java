package cloud.paolu.xpanel.pfgo.service;

import cloud.paolu.xpanel.nnr.pojo.LoginReq;
import cloud.paolu.xpanel.nnr.pojo.NNRResp;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

@RetrofitClient(baseUrl = "https://pfgo.pgupy.com")
public interface PFGOService {
    @POST("/ajax/login")
    Call<NNRResp<String>> login(@Body LoginReq loginReq);
}
