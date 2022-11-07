package com.example.spring2.aop.aspects;

import com.example.spring2.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: get list of students");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        for (Student student : students) {
            student.setName("Mr. " + student.getName());
            student.setGrade(student.getGrade() + 1);
        }
        System.out.println("afterGetStudentsLoggingAdvice: got list of students");
    }
}
