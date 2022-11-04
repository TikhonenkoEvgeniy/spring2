package com.example.spring2.hibernate;

import com.example.spring2.hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee")
//                            .getResultList();

            List<Employee> employees = session.createQuery("from Employee where name = 'Alexandr'" +
                            "AND salary > 650")
                    .getResultList();


            for (Employee emp : employees) {
                System.out.println(emp);
            }

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            factory.close();
        }
    }
}
