package com.example.spring2.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We get the book from University library");
        System.out.println("---------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return the book to University library");
    }

    public void getMagazine() {
        System.out.println("We get the magazine from University library");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to University library");
    }

    public void addBook(String user, Book book) {
        System.out.println("We add the book to the library");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to the library");
    }
}
