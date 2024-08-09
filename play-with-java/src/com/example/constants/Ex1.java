package com.example.constants;

// group of related constants

// e.g DAYS
// e.g Weeks

import java.util.concurrent.TimeUnit;

enum Gender {

    MALE(1, "this is male "), FEMALE(2, "this is female"), OTHER(3, "this is other");

    private String description;
    private int code;

    Gender(int code, String description) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}

class Employee {
    private String name;
    private int id;
    private double salary;
    private Gender gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}


interface I {
    void m1();
}

class C {
}

enum E implements I {
    A, B, C;

    @Override
    public void m1() {

    }
}


public class Ex1 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("John");
        e1.setId(101);
        e1.setSalary(10000);
        e1.setGender(Gender.MALE);

//        Thread.sleep(10000);
//        TimeUnit.MINUTES.sleep(10);

    }
}
