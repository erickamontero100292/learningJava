package com.polimorfismo.example;

public class Car extends Vehicle {

    void accelerate(int count) {
        System.out.println("Accelerate "+count+ " from Car");
    }
    void brake(int count ) {
        System.out.println("Brake"+count+" from Car");
    }
}
