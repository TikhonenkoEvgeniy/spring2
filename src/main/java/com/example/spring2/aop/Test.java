package com.example.spring2.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);

        uniLibrary.getBook();
        uniLibrary.returnBook();
        schoolLibrary.getBook();
        uniLibrary.getMagazine();

        context.close();
    }
}