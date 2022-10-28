package com.example.spring2.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        this.students.add(new Student("Tikhonenko Evgeniy", 3, 7.5));
        this.students.add(new Student("Petrov Vasiliy", 1, 5.7));
        this.students.add(new Student("Ivanova Olga", 2, 8.1));
    }

    public List<Student> getStudents() {
        System.out.println(this.students);
        return this.students;
    }
}
