package com.example.demo.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo.infrastructure.repository")
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

    @Bean
    public String someConfig() {
        return "Some global configuration setting";
    }
}
