package com.example.spring2.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Pet pet = context.getBean("dog", Pet.class);
        pet.say();
        context.close();
    }
}
