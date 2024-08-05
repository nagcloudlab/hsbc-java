package com.example.colln;

// hashtable based collection


import com.example.colln.model.Car;

import java.util.Set;

public class Ex8 {

    public static void main(String[] args) {

        Set<Car> cars = new java.util.HashSet<>();

        Car car1 = new Car("Audi", "A4", 2018);
        Car car2 = new Car("Audi", "A4", 2018);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2));

        cars.add(car1);
        boolean b = cars.add(car2);
        System.out.println(b);


        System.out.println(cars.size());


        // 1. hashcode is used to find the bucket
        // 2. equals is used to find the object in the bucket (i.e are the duplicates)
        // 3. if hashcode is different, then equals is not called
        // 4. if hashcode is same, then equals is called
        // 5. if equals is true, then object is not added
        // 6. if equals is false, then object is added
        // 7. if equals is not overridden, then it uses the default implementation
        // 8. if equals is overridden, then it uses the overridden implementation


        Set<String> names = new java.util.HashSet<>(32, 0.75f);
//        Set<String> names = new java.util.LinkedHashSet<>();
        names.add(("B"));
        names.add(("Q"));
        names.add(("P"));
        names.add(("C"));
        names.add(("B"));
        names.add(("A"));

        System.out.println(names);



    }

}
