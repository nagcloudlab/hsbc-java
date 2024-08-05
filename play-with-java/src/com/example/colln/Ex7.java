package com.example.colln;

import com.example.colln.model.Product;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Ex7 {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("F");
        set.add("A");

//        System.out.println(set);

        Set<Product> products = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        products.add(new Product("Laptop", 10));
        products.add(new Product("Mobile", 20));
        products.add(new Product("Tablet", 30));
        boolean b = products.add(new Product("Laptop", 40));
        System.out.println(b);

        System.out.println(products);

    }
}
