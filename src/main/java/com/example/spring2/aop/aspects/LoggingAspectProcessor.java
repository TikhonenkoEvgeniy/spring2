package com.example.spring2.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectProcessor {

    @Before("execution(void get*())")  // Pointcut
    public void beforeAddBookAdvice() {
        System.out.println("Trying get the book");
    }

    @Before("execution(* get*())")  // Pointcut
    public void beforeReturnBook() {
        System.out.println("Trying return the book");
    }
}