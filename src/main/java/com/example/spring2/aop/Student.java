package com.example.spring2.aop;

public class Student {
    private String name;
    private int course;
    private double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getCourse() {
        return this.course;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
