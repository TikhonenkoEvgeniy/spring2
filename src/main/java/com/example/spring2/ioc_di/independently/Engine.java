package com.example.spring2.ioc_di.independently;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Engine {
    private String model;
    private int power;

    public void diagnostic() {
        System.out.println("Engine is accept");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
