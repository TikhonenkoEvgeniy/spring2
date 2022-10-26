package com.example.spring2.aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("The book is got");
    }
}
