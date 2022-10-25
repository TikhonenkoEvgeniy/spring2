package com.example.spring2.ioc_di.independently;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    private Transmission transmission;
    private Suspension suspension;

    public Car(Engine engine, Transmission transmission, Suspension suspension) {
        this.engine = engine;
        this.transmission = transmission;
        this.suspension = suspension;
    }

    public void check() {
        System.out.println("All components are setup");
        engine.diagnostic();
        transmission.diagnostic();
        suspension.diagnostic();
    }
}
