package com.panda.demo.filters;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new LoggingFilter());
        registration.addUrlPatterns("/*");
        registration.setName("LoggingFilter");
        registration.setOrder(1);
        return registration;
    }


    @Bean
    public FilterRegistrationBean crosDominFilter() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CrossDomainFilter());
        registration.addUrlPatterns("/*");
        registration.setName("crosDominFilter");
        registration.setOrder(2);
        return registration;
    }
}
