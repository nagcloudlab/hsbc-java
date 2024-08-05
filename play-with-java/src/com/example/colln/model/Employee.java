package com.example.colln.model;

public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName; // natural order
    private double empSal;

    public Employee(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.empName.compareTo(emp.empName);
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
    }
}
