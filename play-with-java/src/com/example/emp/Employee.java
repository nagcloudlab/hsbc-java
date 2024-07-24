
// package declaration
package com.example.emp;

// import statements
//import java.lang.*;

/**
 * author: Riya
 */

// public Type class
public class Employee {

    // variables

    // a. class/static variables
    public final static String COMPANY_NAME = "ABC";
    public static String tnrName;

    // b. instance variables
    public int id; // 0
    public String name; // null
    public double salary; // 0.0

    // constructors
    // public Employee(){}
    public Employee(int id) {
//        if (id < 0) {
//            throw new IllegalArgumentException("id can't be negative");
//        }
//        this.id = id;
        this(id, "Unknown", 0.0);
    }

    public Employee(int id, String name) {
//        if (id < 0) {
//            throw new IllegalArgumentException("id can't be negative");
//        }
//        if (name == null || name.isEmpty()) {
//            throw new IllegalArgumentException("name can't be empty");
//        }
//        this.id = id;
//        this.name = name;
        this(id, name, 0.0);
    }

    public Employee(int id, String name, double salary) {
        if (id < 0) {
            throw new IllegalArgumentException("id can't be negative");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name can't be empty");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("salary can't be negative");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // methods
    // a. class/static methods
    public static void doTeach() {
        System.out.println("Teaching...");
    }

    // b. instance methods
    public void doListenAndWork() {
        System.out.println("Listening and Working...");
    }

}

// other types
class Foo {
}

class Bar {
}
