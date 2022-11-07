package com.example.spring2.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");

        Cat myCat = context.getBean("pet", Cat.class);
        myCat.setName("Belka");
        Cat yourCat = context.getBean("pet", Cat.class);
        yourCat.setName("Strelka");

        System.out.println(myCat.getName());
        System.out.println(yourCat.getName());
        System.out.println(myCat == yourCat);

        context.close();
    }
}
