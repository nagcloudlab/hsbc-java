package com.example.ex2;

import com.example.ex2.bill.BillingImpl;

public class Application {
    public static void main(String[] args) {

        BillingImpl billingObj = new BillingImpl();

        String[] cart1 = {"123", "456", "789"};
        double total = billingObj.getTotalPrice(cart1);
        System.out.println("Total price for cart1: " + total);

        String[] cart2 = {"123", "456"};
        total = billingObj.getTotalPrice(cart2);
        System.out.println("Total price for cart2: " + total);


    }
}
