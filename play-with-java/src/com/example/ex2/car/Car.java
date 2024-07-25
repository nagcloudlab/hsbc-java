package com.example.ex2.car;

import com.example.ex2.wheel.MRFWheel;
import com.example.ex2.wheel.Wheel;
import com.example.ex2.wheel.WheelFactory;

public class Car {
    public Car() {
        System.out.println("Car object created");
    }

    public void move() {
//        MRFWheel wheel = new MRFWheel();
        Wheel wheel = WheelFactory.getWheel("CEAT");
//        wheel.rotate();
        System.out.println("Car moving");
    }
}
