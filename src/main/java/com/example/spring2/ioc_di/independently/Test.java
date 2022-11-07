package com.example.spring2.ioc_di.independently;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

        Car car = context.getBean("car", Car.class);
        car.check();


        Truck truck = context.getBean("truck", Truck.class);
        truck.check();

        context.close();
    }
}
