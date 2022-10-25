package com.example.spring2.ioc_di.independently;

public class Truck {
    private Engine engine;
    private Transmission transmission;
    private Suspension suspension;

    public Truck(Engine engine, Transmission transmission, Suspension suspension) {
        this.engine = engine;
        this.transmission = transmission;
        this.suspension = suspension;
    }

    public void check() {
        System.out.println("Truck - All components are setup");
        engine.diagnostic();
        transmission.diagnostic();
        suspension.diagnostic();
    }
}
