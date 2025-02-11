package cloud.paolu.xpanel.config;

import cloud.paolu.xpanel.nnr.NNRProperties;
import cloud.paolu.xpanel.nyan.NyanProperties;
import cloud.paolu.xpanel.pfgo.PFGOProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableConfigurationProperties({NNRProperties.class, PFGOProperties.class, NyanProperties.class})
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration registration = registry.addInterceptor(new UserLoginInterceptor());
//        registration.addPathPatterns("/**");
//        registration.excludePathPatterns(
//                "/login",
//                "/callback",
//                "/**/*.html",
//                "/**/*.js",
//                "/**/*.css"
//        );
    }
}