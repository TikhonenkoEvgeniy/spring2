package com.example.spring2.ioc_di.independently;

import org.springframework.stereotype.Component;

@Component
public class Suspension implements Part {
    private String model;
    private int weight;

    public void diagnostic() {
        System.out.println("Suspension is accept");
    }

    @Override
    public String toString() {
        return "Suspension{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
