package com.example.oo.ex1;

import com.example.oo.ex1.emp.Employee;

/**
 * author: Dhiya
 */

public class Application {
    public static void main(String[] args) {

        //System.out.println(Employee.COMPANY_NAME); // ABC
        //Employee.COMPANY_NAME="XYZ"; // error
        //Employee.tnrName = "Nag";

        Employee e1 = new Employee(101);
        e1.setName("John");
        e1.setSalary(1000.00);

//        System.out.println(e1.getId());
//        System.out.println(e1.getName());
//        System.out.println(e1.getSalary());

        System.out.println(e1); // e1.toString()

    }
}
