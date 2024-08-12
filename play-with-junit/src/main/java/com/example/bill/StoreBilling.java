package com.example.bill;

import com.example.pm.PriceMatrix;

import java.util.List;

/**
 * author : Foo
 */

public class StoreBilling implements Billing {

    private PriceMatrix priceMatrix=null;

    public StoreBilling(PriceMatrix priceMatrix) {
        this.priceMatrix = priceMatrix;
    }

    @Override
    public double getTotalPrice(List<String> cart) {
        double total = 0.0;
        for (String item : cart) {
            total += priceMatrix.getPrice(item);
        }
        return total;
    }
}
