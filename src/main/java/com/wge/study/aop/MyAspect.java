package com.wge.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* com.wge.study.service.*.*(..))")
    public void point(){}

    @Before("point()")
    public void before() {
        System.out.println("注解方式开启之前");
    }

    @After("point()")
    public void after() {
        System.out.println("注解方式开启之后");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        // 获取方法的具体信息，包括全名称和返回值
        // eg：String com.wge.study.service.UserService.getName()
        System.out.println("签名：" + joinPoint.getSignature());
        Object[] args = joinPoint.getArgs();
        System.out.println(args[0]);
        Object proceed = joinPoint.proceed(new Object[]{"wge"});
        System.out.println("环绕后");
        // 拿到方法的返回值 eg：OK
        System.out.println(proceed);
    }
}
