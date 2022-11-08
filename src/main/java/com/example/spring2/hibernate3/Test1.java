package com.example.spring2.hibernate3;

import com.example.spring2.hibernate2.model.Detail;
import com.example.spring2.hibernate3.model.Department;
import com.example.spring2.hibernate3.model.Employee;
import jdk.swing.interop.DispatcherWrapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

//        Department department = new Department("IT", 1200, 300);
//        Employee emp1 = new Employee("Evgeniy", "Tikhonenko", 500);
//        Employee emp2 = new Employee("Elena", "Smirnova", 600);
//        department.addEmployeeToDepartment(emp1);
//        department.addEmployeeToDepartment(emp2);

        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            if (session != null) { session.close(); }
            if (factory != null) { factory.close(); }
        }
    }
}
