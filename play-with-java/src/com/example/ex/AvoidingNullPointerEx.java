package com.example.ex;


/*
    Person
    Car ( optional )
    Insurance ( optional )
 */


import java.util.Optional;

class Insurance {
    private String name;

    public Insurance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private Insurance insurance; // optional -> null

    public Car(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}

class Person {
    private Car car; // optional -> null

    public Person(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}


public class AvoidingNullPointerEx {

    public static void main(String[] args) {

        // scenario 1, person has car and car has insurance

        Insurance insurance = new Insurance("LIC");
        Car car = new Car(insurance);
        Person person = new Person(car);

        // get insurance name
        String insuranceName = person.getCar().getInsurance().getName();
        System.out.println("Insurance Name: " + insuranceName);

        // scenario 2, person has car but car has no insurance

        Insurance insurance2 = null;
        Car car2 = new Car(insurance2);
        Person person2 = new Person(car2);

        // get insurance name
        //String insuranceName2 = person2.getCar().getInsurance().getName();
        //System.out.println("Insurance Name: "+insuranceName2);

        // to avoid null pointer exception before java 1.8
        Insurance insurance3 = person2.getCar().getInsurance();
        if (insurance3 != null) {
            System.out.println("Insurance Name: " + insurance3.getName());
        } else {
            System.out.println("Insurance not available");
        }

        // scenario 3, person has no car

        Car car3 = null;
        Person person3 = new Person(car3);

        // get insurance name
        //String insuranceName3 = person3.getCar().getInsurance().getName();
        //System.out.println("Insurance Name: "+insuranceName3);

        // to avoid null pointer exception before java 1.8

        Car car4 = person3.getCar();
        if (car4 != null) {
            Insurance insurance4 = car4.getInsurance();
            if (insurance4 != null) {
                System.out.println("Insurance Name: " + insurance4.getName());
            } else {
                System.out.println("Insurance not available");
            }
        } else {
            System.out.println("Car not available");
        }


    }

}
