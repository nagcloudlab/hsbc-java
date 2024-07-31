package com.example.oo.ex4;

class Mobile {
    String brand;
    int price;
}

class Person {
    String name;
    int age;
    Mobile mobile;
}

public class ReferenceTypes {
    public static void main(String[] args) {

        Person p1 = new Person(); // p1 is a reference to an object of type Person
        p1.name = "Riya";
        p1.age = 10;

        Mobile m1 = new Mobile(); // m1 is a reference to an object of type Mobile
        m1.brand = "Samsung";
        m1.price = 20000;

        p1.mobile = m1; // p1.mobile is a reference to an object of type Mobile

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Mobile Brand: " + p1.mobile.brand);
        System.out.println("Mobile Price: " + p1.mobile.price);

    }
}
