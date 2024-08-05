package com.example.fp;


// Farm Inventory Appln

import com.example.colln.model.Apple;

import java.util.ArrayList;
import java.util.List;


interface Predicate {
    boolean test(Apple apple);
}

public class Ex1 {

    public static void main(String[] args) {


        List<Apple> inventory = List.of(
                new Apple("green", 150),
                new Apple("red", 120),
                new Apple("green", 170)
        );

        // Req-1: Filter all green apples
        System.out.println(
                //filterGreenApples(inventory)
                //filterApplesByColor(inventory, "green")
                //filterApples(inventory, "green",0)
                filterApples(inventory, new Predicate() {
                    public boolean test(Apple apple) {
                        return apple.getColor().equals("green");
                    }
                })
        );
        // Req-2: Filter all red apples
        System.out.println(
                //filterRedApples(inventory)
                //filterApplesByColor(inventory, "red")
                filterApples(inventory, new Predicate() {
                    @Override
                    public boolean test(Apple apple) {
                        return apple.getColor().equals("red");
                    }
                })
        );

        // Req-3: Filter all apples by weight

        System.out.println(
                //filterApplesByWeight(inventory, 150)
                //filterApples(inventory, null, 150)
                filterApples(inventory, new Predicate() {
                    @Override
                    public boolean test(Apple apple) {
                        return apple.getWeight() == 150;
                    }
                })
        );


    }


    public static List<Apple> filterApples(List<Apple> inventory, Predicate o) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (o.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


//    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if(color!=null){
//                if (apple.getColor().equals(color)) {
//                    result.add(apple);
//                }
//            }
//            if(color==null){
//                if (apple.getWeight() == weight) {
//                    result.add(apple);
//                }
//            }
//        }
//        return result;
//    }


//    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getWeight() == weight) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//
//    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getColor().equals(color)) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

//    public static List<Apple> filterGreenApples(List<Apple> inventory) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getColor().equals("green")) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//
//    public static List<Apple> filterRedApples(List<Apple> inventory) {
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple : inventory) {
//            if (apple.getColor().equals("red")) {
//                result.add(apple);
//            }
//        }
//        return result;
//    }

}
