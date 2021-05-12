package com.wge.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}
