package com.example.spring2.aop.aspects;

import com.example.spring2.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(100)
public class LoggingAspectProcessor {

    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")  // Pointcut
    public void beforeGetLoggingAdvice() { System.out.println("Logging: Trying to get the book or the magazine"); }

    @Before("com.example.spring2.aop.aspects.Pointcuts.allAddMethods()")  // Pointcut
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("Logging: Trying to add the book or the magazine");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature: " + signature);
        System.out.println("MethodSignature.getMethod(): " + signature.getMethod());
        System.out.println("MethodSignature.getReturnType(): " + signature.getReturnType());
        System.out.println("MethodSignature.getName(): " + signature.getName());
        Object[] params = joinPoint.getArgs();
        if (params.length > 0) {
            for (Object object : params) {
                if (object instanceof Book) {
                    System.out.println("Book name: " + ((Book) object).getName() + "\n" +
                            "Book author: " + ((Book) object).getAuthor() + "\n" +
                            "Year of publication: " + ((Book) object).getYearOfPublication());
                }
                if (object instanceof String) {
                    System.out.println("User: " + object);
                }
            }
        } else {
            System.out.println("No args");
        }
        System.out.println("------------------------------------------------");

    }

//    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetMethods()")  // Pointcut 2
//    public void beforeGetSecurityAdvice() { System.out.println("Logging: Security is processing"); }

//    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("com.example.spring2.aop.aspects.Pointcuts.allReturnFromLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("com.example.spring2.aop.aspects.Pointcuts.allGetAndReturnFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }

//    @Before("com.example.spring2.aop.aspects.Pointcuts.allExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllExceptMagazineLoggingAdvice() {
//        System.out.println("beforeAllExceptMagazineLoggingAdvice: writing log #4");
//    }

}
