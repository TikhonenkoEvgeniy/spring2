package com.example.spring2.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

        Cat cat = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println(cat == cat2);

        context.close();
    }
}
