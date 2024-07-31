package com.example.ex;


import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }
}

public class ErrorEx {

    public static void m1() {
        m1();
    }

    public static void main(String[] args) {

        //m1();

        Runtime runtime = Runtime.getRuntime();
        List<Product> products = new ArrayList<>();

        // total memory in Megabytes
        long totalMemory = runtime.totalMemory() / (1024 * 1024);
        System.out.println("Total Memory: " + totalMemory + " MB");

        for (int i = 0; i < 1000000000; i++) {
            Product product = new Product(i, "Product" + i);
            //System.out.println(product);
            products.add(product);
        }

        // free memory in Megabytes
        long freeMemory = runtime.freeMemory() / (1024 * 1024);
        System.out.println("Free Memory: " + freeMemory + " MB");

//        System.gc();

        // free memory in Megabytes
        freeMemory = runtime.freeMemory() / (1024 * 1024);
        System.out.println("Free Memory: " + freeMemory + " MB");

    }
}
