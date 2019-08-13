package com.polimorfismo.example;

public  abstract  class Vehicle {
    int licensePlate;
    int numberWheel;
    int numberDoor;

    public Vehicle() {
    }

    void accelerate(int count) {
        System.out.println("Accelerate "+count+ " from vehicle");
    }


    void brake(int count ) {
        System.out.println("Brake "+count+" from vehicle");
    }
}
