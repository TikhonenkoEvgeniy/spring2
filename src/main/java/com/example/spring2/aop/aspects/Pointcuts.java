package com.example.spring2.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* get*())")
    protected void allGetMethods() {}

    @Pointcut("execution(* com.example.spring2.aop.UniLibrary.get*())")
    protected void allGetFromUniLibrary() {}

    @Pointcut("execution(* com.example.spring2.aop.UniLibrary.return*())")
    protected void allReturnFromLibrary() {}

    @Pointcut("allGetFromUniLibrary() || allReturnFromLibrary()")
    protected void allGetAndReturnFromUniLibrary() {}

    @Pointcut("execution(* com.example.spring2.aop.UniLibrary.*(..))")
    protected void allFromUniLibrary() {}

    @Pointcut("execution(void com.example.spring2.aop.UniLibrary.returnMagazine())")
    protected void returnMagazineFromUniLibrary() {}

    @Pointcut("allFromUniLibrary() && !returnMagazineFromUniLibrary()")
    protected void allExceptReturnMagazineFromUniLibrary() {}
}
