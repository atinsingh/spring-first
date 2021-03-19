package io.pragra.learning.springfirst.domain;
// Tight coupling
public class Car {
    private String make;
    private IEngine engine;

    public Car(String make, IEngine engine) {
        this.make = make;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", engine=" + engine +
                '}';
    }
}
