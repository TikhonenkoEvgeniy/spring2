package com.example.spring2.ioc_di.independently;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Car car = context.getBean("car", Car.class);
        car.check();
        context.close();
    }
}
