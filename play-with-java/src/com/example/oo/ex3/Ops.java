package com.example.oo.ex3;

public class Ops extends Employee {

    // Fields
//    private int id;
//    private String name;
//    private double salary;
    private String opsSkills;

    // Constructor
    public Ops(int id, String name, double salary, String opsSkills) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
        super(id, name, salary);
        this.opsSkills = opsSkills;
    }

    public String getOpsSkills() {
        return opsSkills;
    }

}
