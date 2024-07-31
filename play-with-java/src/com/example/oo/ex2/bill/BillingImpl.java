package com.example.oo.ex2.bill;

import com.example.oo.ex2.pm.PriceMatrix;
import com.example.oo.ex2.pm.PriceMatrixFactory;

public class BillingImpl {

    private PriceMatrix priceMatrix;

    public BillingImpl(PriceMatrix priceMatrix) {
        this.priceMatrix = priceMatrix;
    }

    public double getTotalPrice(String[] cart) {
        double total = 0;
        //PriceMatrixV1 excelPriceMatrixObj = new PriceMatrixV1();
        //PriceMatrix excelPriceMatrixObj = PriceMatrixFactory.getPriceMatrix("v1");
        for (String item : cart) {
            double itemPrice = priceMatrix.getPrice(item);
            total += itemPrice;
        }
        return total;
    }

}
