package com.example.ex9;


// Interface with default method

interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
