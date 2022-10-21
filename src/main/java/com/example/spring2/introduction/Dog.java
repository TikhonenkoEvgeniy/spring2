package com.example.spring2.introduction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
