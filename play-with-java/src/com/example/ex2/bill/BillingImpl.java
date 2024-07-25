package com.example.ex2.bill;

import com.example.ex2.pm.PriceMatrix;
import com.example.ex2.pm.PriceMatrixFactory;

public class BillingImpl {

    public double getTotalPrice(String[] cart) {
        double total = 0;
        //PriceMatrixV1 excelPriceMatrixObj = new PriceMatrixV1();
        PriceMatrix excelPriceMatrixObj = PriceMatrixFactory.getPriceMatrix("v1");
        for (String item : cart) {
            double itemPrice = excelPriceMatrixObj.getPrice(item);
            total += itemPrice;
        }
        return total;
    }

}
