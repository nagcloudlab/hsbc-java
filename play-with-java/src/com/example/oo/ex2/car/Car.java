package com.example.oo.ex2.car;

import com.example.oo.ex2.wheel.MRFWheel;
import com.example.oo.ex2.wheel.Wheel;
import com.example.oo.ex2.wheel.WheelFactory;

public class Car {

    private Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("Car object created");
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }


    public void move() {
        // MRFWheel wheel = new MRFWheel();
        // Wheel wheel = WheelFactory.getWheel("CEAT");
        wheel.rotate(100);
        System.out.println("Car moving");
    }
}
