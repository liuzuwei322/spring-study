package com.wge.study.aspect;

public class XmlAspect {
    public void before() {
        System.out.println("xml方式aop开始前");
    }

    public void after() {
        System.out.println("xml方式aop结束后");
    }
}
