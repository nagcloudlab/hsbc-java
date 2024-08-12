package com.example.bill;

//import com.example.pm.ExcelPriceMatrix;

import com.example.pm.ExcelPriceMatrix;
import com.example.pm.PriceMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class StoreBillingTest {

    private Billing billing;

    @BeforeEach
    public void setUp() {

        //PriceMatrix priceMatrixStub = new PriceMatrixStub(); // stub
        PriceMatrix priceMatrixMock = mock(PriceMatrix.class);
        when(priceMatrixMock.getPrice("123")).thenReturn(100.00);
        when(priceMatrixMock.getPrice("456")).thenReturn(200.00);
        when(priceMatrixMock.getPrice("789")).thenReturn(0.00);
//        PriceMatrix priceMatrix = new ExcelPriceMatrix(); // real object
        billing = new StoreBilling(priceMatrixMock);
    }

    // test methods

    @Test
    public void test1() {
        List<String> cart = List.of("123", "456", "789");
        double actual = billing.getTotalPrice(cart);
        assertEquals(300, actual);
    }


}
