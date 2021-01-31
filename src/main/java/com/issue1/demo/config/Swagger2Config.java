package com.issue1.demo.config;

import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class Swagger2Config extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        // 解决静态资源无法访问

        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");

        // 解决swagger无法访问

        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        // 解决swagger的js文件无法访问

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}