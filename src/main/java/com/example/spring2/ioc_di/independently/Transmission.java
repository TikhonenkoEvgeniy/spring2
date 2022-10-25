package com.example.spring2.ioc_di.independently;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Transmission implements Part {
    private String model;
    private int speeds;

    public void diagnostic() {
        System.out.println("Transmission is accept");
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "model='" + model + '\'' +
                ", speeds=" + speeds +
                '}';
    }
}
