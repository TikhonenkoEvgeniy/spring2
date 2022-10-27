package com.example.spring2.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("book book")
    private String name;

    public String getName() {
        return name;
    }
}
