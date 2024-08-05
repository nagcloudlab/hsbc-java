package com.example.colln;


// Map

import com.example.colln.model.Car;
import com.example.colln.model.Owner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Riya", "chennai");
        Owner owner2 = new Owner("Diya", "chennai");

        Car car1 = new Car("Audi", "A4", 2018);
        Car car2 = new Car("BMW", "X1", 2019);

        Map<Owner, Car> map = new HashMap<>();
        //Map<Owner, Car> map = new LinkedHashMap<>();
        map.put(owner1, car1);
        map.put(owner2, car2);

//        for(Owner owner : map.keySet()) {
//            System.out.println(owner + " -> " + map.get(owner));
//        }

//        for (Car car : map.values()) {
//            System.out.println(car);
//        }

        // search by key

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner name: ");
        String name = scanner.next();

        Owner searchOwner = new Owner(name, null);

        Car car = map.get(searchOwner);
        if (car != null) {
            System.out.println("Car: " + car);
        } else {
            System.out.println("Car not found");
        }


    }

}
