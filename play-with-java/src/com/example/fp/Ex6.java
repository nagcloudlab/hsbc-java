package com.example.fp;

import com.example.fp.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex6 {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 5000));
        employees.add(new Employee(102, "Mike", 3000));
        employees.add(new Employee(103, "John", 2000));
        employees.add(new Employee(104, "Mary", 2000));
        employees.add(new Employee(105, "David", 5000));

        Comparator<Employee> byName = (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName());
        Comparator<Employee> bySalary = (e1, e2) -> Double.compare(e1.getEmpSal(), e2.getEmpSal());
        Comparator<Employee> byNameAndSalary= byName.thenComparing(bySalary);

        employees.sort(byNameAndSalary);

        for (Employee e : employees) {
            System.out.println(e);
        }

    }

}
