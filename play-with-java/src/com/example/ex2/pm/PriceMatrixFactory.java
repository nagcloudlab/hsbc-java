package com.example.ex2.pm;

public class PriceMatrixFactory {

    public static PriceMatrix getPriceMatrix(String type) {
        if (type.equals("v1")) {
            return new PriceMatrixV1();
        } else if (type.equals("v2")) {
            return new PriceMatrixV2();
        } else {
            throw new IllegalArgumentException("invalid type");
        }
    }

}
