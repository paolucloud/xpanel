package cloud.paolu.xpanel.nyan;

import cloud.paolu.xpanel.nyan.pojo.LoginReq;
import cn.hutool.core.collection.CollUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Slf4j
@Component
public class NyanServiceProvider implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private NyanProperties nyanProperties;

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    private final Map<String, NyanService> serviceMap = new ConcurrentHashMap<>();

    public Map<String, NyanService> getAllServices() {
        return this.serviceMap;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        serviceMap.clear();
        getCookie();
        if (CollUtil.isNotEmpty(nyanProperties.getItems())) {
            nyanProperties.getItems().forEach(nyanItem -> serviceMap.put(nyanItem.getName(), createService(nyanItem.getName(), nyanItem.getUrl())));
        }
    }

    private NyanService createService(String name, String url) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @NotNull
                    @Override
                    public Response intercept(@NotNull Chain chain) throws IOException {
                        String key = "nyan:" + name;
                        if (Boolean.TRUE.equals(stringRedisTemplate.hasKey(key))) {
                            Request request = chain.request().newBuilder().addHeader(AUTHORIZATION, stringRedisTemplate.opsForValue().get(key)).build();
                            return chain.proceed(request);
                        } else {
                            Request request = chain.request().newBuilder().build();
                            return chain.proceed(request);
                        }
                    }
                })
                .build();
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(NyanService.class);
    }

    public void getCookie() {
        nyanProperties.getItems().forEach(nyanItem -> {
            String key = "nyan:" + nyanItem.getName();
            OkHttpClient client = new OkHttpClient.Builder().build();
            NyanService nyanService = new Retrofit.Builder()
                    .baseUrl(nyanItem.getUrl())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()
                    .create(NyanService.class);
            try {
                String token = nyanService.login(new LoginReq(nyanItem.getUsername(), nyanItem.getPassword())).execute().body().getData();
                stringRedisTemplate.opsForValue().set(key, token);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
