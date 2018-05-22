package com.panda.demo.config;

import com.panda.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    //@Override protected void addInterceptors(InterceptorRegistry registry) {
    //    super.addInterceptors(registry);
    //
    //    registry.addInterceptor(loginInterceptor())
    //        .addPathPatterns("/**")
    //        .excludePathPatterns("/v1/login");
    //}
    //
    //
    //
    //@Bean
    //public LoginInterceptor loginInterceptor() {
    //
    //    return new LoginInterceptor();
    //}
}
