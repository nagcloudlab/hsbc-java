package com.example.oo.ex2;

import com.example.oo.ex2.bill.BillingImpl;
import com.example.oo.ex2.car.Car;
import com.example.oo.ex2.wheel.Wheel;
import com.example.oo.ex2.wheel.WheelFactory;

public class Application {
    public static void main(String[] args) {

//        BillingImpl billingObj = new BillingImpl();
//
//        String[] cart1 = {"123", "456", "789"};
//        double total = billingObj.getTotalPrice(cart1);
//        System.out.println("Total price for cart1: " + total);
//
//        String[] cart2 = {"123", "456"};
//        total = billingObj.getTotalPrice(cart2);
//        System.out.println("Total price for cart2: " + total);


        Wheel mrfWheel = WheelFactory.getWheel("MRF");
        Car car = new Car(mrfWheel); // dependency injection
        System.out.println("-".repeat(10));
        car.move();
        System.out.println("-".repeat(10));
        car.move();
        System.out.println("-".repeat(10));

        Wheel ceatWheel = WheelFactory.getWheel("CEAT");
        car.setWheel(ceatWheel);
        System.out.println("-".repeat(10));
        car.move();
        System.out.println("-".repeat(10));
        car.move();
        System.out.println("-".repeat(10));

        Wheel jkWheel = WheelFactory.getWheel("JK");
        car.setWheel(jkWheel);
        car.move();


    }
}
