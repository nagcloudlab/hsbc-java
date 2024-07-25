package com.example.ex3;

public class Robot extends LivingThing {

    public void eat() {
        System.out.println("Robot is eating");
    }

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
