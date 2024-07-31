package com.example.oo.ex2.wheel;

public class CEATWheel implements Wheel {

    public CEATWheel() {
        System.out.println("CEATWheel object created");
    }

    public int rotate(int speed) {
        System.out.println("CEAT Wheel spinning..");
        feature1();
        return 200;
    }

    public void feature1() {
        //...
    }

}
