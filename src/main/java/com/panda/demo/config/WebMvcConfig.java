package com.panda.demo.config;

import com.panda.demo.interceptor.LoginInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

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

    @Override protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new FeignRequestMappingHandlerMapping();
    }


    private static class FeignRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
        @Override
        protected boolean isHandler(Class<?> beanType) {
            return super.isHandler(beanType) &&
                !AnnotatedElementUtils.hasAnnotation(beanType, FeignClient.class);
        }
    }
}
