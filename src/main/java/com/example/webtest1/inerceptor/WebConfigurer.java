package com.example.webtest1.inerceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/webapi/error","/login",
                        "/js/**","/image/**","/plugins/**","/fonts/**",
                        "/pagejs/**", "/css/**","/webapi/login");
    }
}
