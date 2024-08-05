package com.example.colln;

// how to sort List colln objects?

import com.example.colln.model.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 150));
        apples.add(new Apple("red", 120));
        apples.add(new Apple("green", 130));
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 100));


        // sorting
        // - compare
        // - swap

        // sorting algorithm
        // - bubble sort
        // - selection sort
        // - insertion sort
        // - quick sort
        // - merge sort
        // - heap sort


        // sort apples based on weight
        Collections.sort(apples);


        display(apples);


    }

    private static void display(List<Apple> apples) {
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }

}
