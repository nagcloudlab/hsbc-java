package com.example.io.model;

public class TechEmployee extends Employee {

    private static final long serialVersionUID = 1212121212121212121L;

    private String techSkill;

    public TechEmployee(String name, int age, double salary, String techSkill) {
        super(name, age, salary);
        this.techSkill = techSkill;
    }

    public String toString() {
        return super.toString() + ", Tech Skill: " + techSkill;
    }
}
