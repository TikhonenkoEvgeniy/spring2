package com.example.spring2.introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created");
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
