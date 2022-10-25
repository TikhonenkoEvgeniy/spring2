package com.example.spring2.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
    private String name;
    private int age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created");
    }

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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
