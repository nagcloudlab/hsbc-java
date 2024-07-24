package com.example.ex2.bill;

import com.example.ex2.pm.ExcelPriceMatrix;

/*

    design issues

    -> tight-coupling b/w dependent & dependency
        => maintenance issues i.e not able expant with new features easily
    -> unit testing not possible
        => bug fix slow, dev slow

    performance issues

    -> creating dependency obj on each transaction
        => resource use high, responsive to user..

     why these issues?

     How to fix ?


 */

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
