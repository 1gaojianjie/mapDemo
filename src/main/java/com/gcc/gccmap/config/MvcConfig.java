package com.gcc.gccmap.config;

import com.gcc.gccmap.interceptor.LogInterceptor;
import com.gcc.gccmap.interceptor.PermissionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置过滤器
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    LogInterceptor logInterceptor;

    @Autowired
    PermissionInterceptor permissionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor).addPathPatterns("/**").excludePathPatterns("/login/user","/sendEmailCode","/user/Register","/user/recoverPwd","/swagger-ui.html")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**").order(1);

        registry.addInterceptor(permissionInterceptor).addPathPatterns("/**").excludePathPatterns("/login/user","/sendEmailCode","/user/Register","/user/recoverPwd","/swagger-ui.html","/logout/user")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**").order(2);
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
