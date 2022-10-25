package com.example.spring2.ioc_di.independently;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

        Car car = context.getBean("car", Car.class);
        car.check();
        context.close();
    }
}
