package com.userbecards.usercards.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Add your frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Add allowed methods
                .allowedHeaders("*") // Add allowed headers
                .allowCredentials(true); // Allow credentials if needed
    }
}

