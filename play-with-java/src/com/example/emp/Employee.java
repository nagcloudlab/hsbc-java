
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
    private int id; // 0
    private String name; // null
    private double salary; // 0.0

    // constructors
    // public Employee(){}
    public Employee(int id) {
        this(id, "Unknown", 0.0);
    }
    public Employee(int id, String name) {
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

    // accessor methods ( set / get )
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        if(name==null||name.isEmpty())
            throw new IllegalArgumentException("invalid name");
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(double salary){
        // check if it valid
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }

    // a. class/static methods
    public static void doTeach() {
        System.out.println("Teaching...");
    }

    // b. instance methods
    public void doListenAndWork() {
        System.out.println("Listening and Working...");
    }

}

