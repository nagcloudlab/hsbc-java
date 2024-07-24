package com.example.ex2.bill;

import com.example.ex2.pm.ExcelPriceMatrix;

public class BillingImpl {

    public double getTotalPrice(String[] cart) {
        double total = 0;
        ExcelPriceMatrix excelPriceMatrixObj = new ExcelPriceMatrix();
        for (String item : cart) {
            double itemPrice = excelPriceMatrixObj.getPrice(item);
            total += itemPrice;
        }
        return total;
    }

}
