package com.example.ex2.wheel;

public class MRFWheel implements Wheel {
    public MRFWheel() {
        System.out.println("MRFWheel object created");
    }

    public int rotate(int speed) {
        System.out.println("MRF Wheel rotating");
        return 100;
    }
}
