package cloud.paolu.xpanel.nnr.service;


import cloud.paolu.xpanel.nnr.NNRSessionInterceptor;
import cloud.paolu.xpanel.nnr.NNRTokenInterceptor;
import cloud.paolu.xpanel.nnr.pojo.*;
import cn.hutool.json.JSONObject;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import kotlin.Result;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@RetrofitClient(baseUrl = "https://nnr.moe")
@Intercept(handler = NNRSessionInterceptor.class, exclude = {"/login","/api/**"})
@Intercept(handler = NNRTokenInterceptor.class, include = "/api/**")
public interface NNRService {

    @POST("/login")
    Call<NNRResp<String>> login(@Body LoginReq loginReq);

    @POST("/api/servers")
    Call<NNRApiResp<List<NNRServer>>> getServers();

    @POST("/api/rules")
    Call<NNRApiResp<List<NNRRule>>> getRules();

    @POST("/rules/check")
    Call<JSONObject> checkRules(@Body RulesReq rulesReq);

    @POST("/api/rules/del")
    Call<JSONObject> delRule(@Body RulesReq rulesReq);

    @POST("/api/rules/add")
    Call<NNRApiResp<AddRuleResp>> addRule(@Body AddRuleReq addRuleReq);

}
