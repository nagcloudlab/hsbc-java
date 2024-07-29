package com.example.ex10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Apple(String color, int weight) {
}

public class Ex2 {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("red", 150));
        apples.add(new Apple("green", 250));


        // way-1: Local Named Inner Class
//        class AppleByWeight implements Comparator<Apple> {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Integer.compare(o1.weight(), o2.weight());
//            }
//        }
//        Comparator<Apple> appleByWeight = new AppleByWeight();

        // Way-2: Local Anonymous Inner Class
        Comparator<Apple> appleByWeight = new Comparator<>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.weight(), o2.weight());
            }
        };


        // sort.. by weight
        apples.sort(appleByWeight);

        // print
        for (Apple apple : apples) {
            System.out.println(apple);
        }

    }

}

