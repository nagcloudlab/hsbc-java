package com.example.colln;


// List colln

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex3 {

    public static void main(String[] args) {

        List<String> vector = new Vector<>(); // dynamic array
        List<String> arrayList = new ArrayList<>(10000000); // dynamic array
        List<String> linkedList = new LinkedList<>(); // doubly linked list

        addElements(vector);
        addElements(arrayList);
        addElements(linkedList);

    }

    private static void addElements(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add("Element " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken to add elements in " + list.getClass().getSimpleName() + " is " + (end - start) + " ms");
    }

}
