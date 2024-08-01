package com.example.io.model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDateTime;

/**
 * author:  Francisco Valdes
 */


public class Employee implements java.io.Serializable {

    private static String tnrName = "Francisco Valdes";

    private String name;
    private int age;
    private transient double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }


}
