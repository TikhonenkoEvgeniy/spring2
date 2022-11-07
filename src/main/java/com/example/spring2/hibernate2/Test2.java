package com.example.spring2.hibernate2;

import com.example.spring2.hibernate2.model.Detail;
import com.example.spring2.hibernate2.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
        Detail detail = new Detail("New York", "+15558932083", "nikolos@gmail.com");
        employee.setEmpDetail(detail);
        detail.setEmployee(employee);

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(detail);
            session.getTransaction().commit();
            System.out.println("Saved!");
        } finally {
            if (session != null) { session.close(); }
            if (factory != null) { factory.close(); }
        }
    }
}
