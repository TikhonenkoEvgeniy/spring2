package com.example.spring2.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(300)
public class ExceptionHandlingAspect {

    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("Exception: logging get");
    }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(JoinPoint joinPoint) {
        System.out.println("Exception: logging add");
    }
}
