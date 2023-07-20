package cloud.paolu.xpanel.config;

import cloud.paolu.xpanel.interceptor.UserLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
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