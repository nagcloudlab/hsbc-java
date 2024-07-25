package com.example.ex2.bill;

import com.example.ex2.pm.PriceMatrix;
import com.example.ex2.pm.PriceMatrixFactory;

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

      -> dependent itself creating its own dependency

     How to fix design issues?

     -> Don't create dependency in dependent's class,
        get from factory, and abstract dependency via interface


 */

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
