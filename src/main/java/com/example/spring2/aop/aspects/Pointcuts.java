package com.example.spring2.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* get*())")
    protected void allGetMethods() {}
}
