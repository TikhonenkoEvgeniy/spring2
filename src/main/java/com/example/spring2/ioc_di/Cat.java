package com.example.spring2.ioc_di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Cat implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow Meow");
    }

    @PostConstruct
    private void init() {
        System.out.println("Cat init");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Cat destroy");
    }
}
