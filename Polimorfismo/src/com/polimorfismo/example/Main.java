package com.polimorfismo.example;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.accelerate(100);
        car.brake(50);
        motorcycle.accelerate(60);
        motorcycle.brake(25);
    }
}
