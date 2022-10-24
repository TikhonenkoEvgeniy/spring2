package com.example.spring2.introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    private void init() {
        System.out.println("Class Dog init method");
    }

    private void destroy() {
        System.out.println("Class Dog destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
