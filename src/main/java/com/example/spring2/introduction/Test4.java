package com.example.spring2.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");

        Cat myCat = context.getBean("pet", Cat.class);
        Cat yourCat = context.getBean("pet", Cat.class);

        System.out.println(myCat);
        System.out.println(yourCat);
        System.out.println(myCat == yourCat);

        context.close();
    }
}
