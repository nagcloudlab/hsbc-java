package com.example.ex3;

public class Dev extends Employee {

    //    // Fields
//    private int id;
//    private String name;
//    private double salary;
    private String devSkills;

    // Constructor
    public Dev(int id, String name, double salary, String javaSkills) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
        super(id, name, salary);
        this.devSkills = javaSkills;
    }

    public String getDevSkills() {
        return devSkills;
    }


}
