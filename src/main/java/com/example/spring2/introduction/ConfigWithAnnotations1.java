package com.example.spring2.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();
        context.close();
    }
}
