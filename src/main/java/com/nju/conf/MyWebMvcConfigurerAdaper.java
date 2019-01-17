package com.nju.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyWebMvcConfigurerAdaper implements WebMvcConfigurer {
//    调试时不拦截
    @Autowired
    AccessInterceptor accessInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(accessInterceptor).
                addPathPatterns("/**").excludePathPatterns("/","/login","/teacherLogin")
                .excludePathPatterns("/css/**","/js/**","/image/**","/assets/**");
//        super.addInterceptors(interceptorRegistry);
    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**","classpath:/webapp/");
//        super.addResourceHandlers(registry);
//    }
}
