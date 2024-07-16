package cloud.paolu.xpanel.nyan;

import cloud.paolu.xpanel.nyan.pojo.DeviceGroup;
import cloud.paolu.xpanel.nyan.pojo.Forward;
import cloud.paolu.xpanel.nyan.pojo.LoginReq;
import cloud.paolu.xpanel.nyan.pojo.NyanResp;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.interceptor.Intercept;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

@RetrofitClient
public interface NyanService {

    @POST("/api/v1/auth/login")
    Call<NyanResp<String>> login(@Body LoginReq req);

    @GET("/api/v1/user/forward?page=1&size=100")
    Call<NyanResp<List<Forward>>> forward();

    @GET("/api/v1/user/devicegroup")
    Call<NyanResp<List<DeviceGroup>>> getDeviceGroup();

    @PUT("/api/v1/user/forward")
    Call<NyanResp<String>> addForward();
}
