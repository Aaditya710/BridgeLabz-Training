package com.reflection.advancedlevel.dependencyreflection;
public class Car {
    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}