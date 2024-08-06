package com.example.streams;

import com.example.streams.model.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {


        List<Dish> menu = List.of(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );


        // Data process pipeline
        // input --> process -> output

        // way-1 : before 1.8

        System.out.println(
                findLowCaloricDishesV1(menu)
        );

        // way-2 : 1.8 onwards with lambda
        System.out.println(
                findLowCaloricDishesV2(menu)
        );

        // way-2 : 1.8 onwards with lambda + streams
        System.out.println(
                findLowCaloricDishesV2(menu)
        );

    }


    // Imperative style
    private static List<String> findLowCaloricDishesV3(List<Dish> menu) {

//        return menu.stream()
//                .filter(dish -> dish.getCalories() < 400)
//                .sorted((d1, d2) -> d1.getCalories() - d2.getCalories())
//                .map(d -> d.getName())
//                .collect(Collectors.toList());

//
//        return menu.stream()
//                .filter(dish -> dish.getCalories() < 400)
//                .sorted(Comparator.comparing(Dish::getCalories))
//                .map(Dish::getName)
//                .collect(Collectors.toList());


        //
        return menu.stream()
                .parallel()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());


    }


    private static List<String> findLowCaloricDishesV2(List<Dish> menu) {
        // step-1 : Find Low Caloric Dishes
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }
        // step-2 : sort by calories
        lowCaloricDishes.sort((d1, d2) -> d1.getCalories() - d2.getCalories());
        // step-3 : get dish names
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            dishNames.add(dish.getName());
        }

        return dishNames;
    }

    private static List<String> findLowCaloricDishesV1(List<Dish> menu) {
        // step-1 : Find Low Caloric Dishes
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }
        // step-2 : sort by calories
        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });
        // step-3 : get dish names
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            dishNames.add(dish.getName());
        }
        return dishNames;
    }

}
