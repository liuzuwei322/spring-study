package com.wge.study.config;

import org.springframework.beans.factory.annotation.Value;

public class User {
    @Value("liuzuwei")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
