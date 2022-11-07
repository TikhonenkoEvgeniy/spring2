package com.example.spring2.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Interview with the vampire")
    private String name;

    @Value("A. Rice")
    private String author;

    @Value("2008")
    private int yearOfPublication;

    public String getName() {
        return this.name;
    }

    public String getAuthor() { return this.author; }

    public int getYearOfPublication() { return this.yearOfPublication; }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
