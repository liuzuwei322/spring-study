package com.wge.study.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user);
    }
}
