package com.example.spring2.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Person {
    private Pet pet;
    @Value("Vasiliy")
    private String name;
    @Value("22")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Person bean is created");
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name is set");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age is set");
    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person - set pet");
    }

    public void callPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
