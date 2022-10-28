package com.example.spring2.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectProcessor {

//    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")  // Pointcut
//    public void beforeGetLoggingAdvice() { System.out.println("Logging: Trying to get the book or the magazine"); }
//
//    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")  // Pointcut 2
//    public void beforeGetSecurityAdvice() { System.out.println("Logging: Security is processing"); }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allReturnFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetAndReturnFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
    }

}
