package com.example.spring2.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(200)
public class SecurityAspectProcessor {

    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Security: Try to get the book or the magazine");
    }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {
        System.out.println("Security: Try to add the book");
    }
}
