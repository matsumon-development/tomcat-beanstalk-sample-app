package com.example.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedHeaders("*")
        .exposedHeaders("error-message","Access-Control-Allow-Origin")
        .allowedMethods("GET","POST")
        .maxAge(3600);
    }
}
