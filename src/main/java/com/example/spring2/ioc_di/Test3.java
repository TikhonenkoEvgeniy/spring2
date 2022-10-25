package com.example.spring2.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //Pet pet = context.getBean("pet", Cat.class);
        //Pet pet = new Dog();

        //Person person = new Person(pet);

        Person person = context.getBean("person", Person.class);
        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
