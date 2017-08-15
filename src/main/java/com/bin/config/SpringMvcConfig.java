package com.bin.config;

import com.bin.filter.ValidateLoginedInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/8/15.
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter{

    @Value("${LOGINED_FILTERS}")
    private String LOGINED_FILTERS;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ValidateLoginedInterceptor())
        .addPathPatterns(LOGINED_FILTERS.split(","));
    }
}
