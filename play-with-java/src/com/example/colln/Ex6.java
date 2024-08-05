package com.example.colln;

import com.example.colln.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 10000));
        employees.add(new Employee(102, "Scott", 20000));
        employees.add(new Employee(103, "Smith", 15000));
        employees.add(new Employee(104, "Allen", 25000));
        employees.add(new Employee(105, "Jones", 30000));


        // Sort employees by name
        //Collections.sort(employees);

//--------------------------------------------------------------------------------
        // Local inner class ( Named class )
//        class SalaryComparator implements Comparator<Employee> {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return Double.compare(e1.getEmpSal(), e2.getEmpSal());
//            }
//        }
//        Comparator<Employee> salaryComparator=new SalaryComparator();
//--------------------------------------------------------------------------------
        // Local inner class ( Anonymous class )
        Comparator<Employee> salaryComparator = new Comparator<>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getEmpSal(), e2.getEmpSal());
            }
        };
//--------------------------------------------------------------------------------

        // Sort employees by salary
        Collections.sort(employees, salaryComparator);


        // Print all employees
        display(employees);

    }

    private static void display(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

}

