package com.example.spring2.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We are getting the book from uni library");
    }

    public String getBook(Book bookName) {
        System.out.println("We are getting the book from uni library");
        return bookName.getName();
    }

    public void returnBook() {
        System.out.println("We return the book to the library");
    }

    public String getMagazine() {
        System.out.println("We are getting the magazine from the library");
        return "";
    }
}
