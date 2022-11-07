package com.example.spring2.ioc_di.independently;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        Part engine = context.getBean("engineBean", Part.class);
        Car car = context.getBean("carBean", Car.class);
        System.out.println(engine);
        car.check();
        context.close();
    }
}
