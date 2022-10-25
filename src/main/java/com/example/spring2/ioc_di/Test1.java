package com.example.spring2.ioc_di;

public class Test1 {

    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        dog.say();
        cat.say();
    }
}
