package com.example.spring2.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");

        Dog dog = context.getBean("dog", Dog.class);
        dog.say();

        Dog dog2 = context.getBean("dog", Dog.class);
        dog2.say();

        System.out.println("Pre-destroy");
        context.close();
    }
}
