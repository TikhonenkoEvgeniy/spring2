package com.example.spring2.ioc_di.independently;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine implements Part {
    @Getter
    @Value("${engine.model}")
    private String model;
    @Getter
    @Value("${engine.power}")
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
