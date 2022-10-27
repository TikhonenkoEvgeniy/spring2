package com.example.spring2.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We are getting the book from uni library");
    }

    public void returnBook() {
        System.out.println("We return the book to the library");
    }

    public String getMagazine() {
        System.out.println("We are getting the magazine from the library");
        return "";
    }
}
