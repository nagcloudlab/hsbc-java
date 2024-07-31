package com.example.oo.ex2.wheel;

public class WheelFactory {
    public static Wheel getWheel(String wheelType) {
        if (wheelType.equals("MRF")) {
            return new MRFWheel();
        } else if (wheelType.equals("CEAT")) {
            return new CEATWheel();
        } else if(wheelType.equals("JK")){
            return new JKWheel();
        } else {
            return null;
        }
    }
}
