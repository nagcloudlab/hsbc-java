package com.example.fp;

import com.example.fp.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 1000));
        employees.add(new Employee(102, "Mike", 2000));
        employees.add(new Employee(103, "Smith", 3000));
        employees.add(new Employee(104, "Mary", 4000));
        employees.add(new Employee(105, "Joe", 5000));

        //Collections.sort(employees);

        // sort by salary

        // way-1:
        //Collections.sort(employees, new SalaryComparator());

        //way-2: Local Inner Class
//        class SalaryComparator implements Comparator<Employee> {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return Double.compare(e1.getEmpSal(), e2.getEmpSal());
//            }
//        }
//
//        Comparator<Employee> salaryComparator = new SalaryComparator();
//        Collections.sort(employees, salaryComparator);

        //way-3: Anonymous Inner Class
//        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return Double.compare(e1.getEmpSal(), e2.getEmpSal());
//            }
//        };
//        Collections.sort(employees, salaryComparator);

        // way-4: Lambda Expression
        //Comparator<Employee> salaryComparatorLambda = (e1, e2) -> Double.compare(e1.getEmpSal(), e2.getEmpSal());

        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getEmpSal(), e2.getEmpSal()));


        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
//
//
//class SalaryComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return Double.compare(e1.getEmpSal(), e2.getEmpSal());
//    }
//}
