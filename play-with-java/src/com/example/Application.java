package com.example;

import com.example.emp.Employee;

import java.util.Scanner;

/**
 * author: Dhiya
 */

public class Application {
    public static void main(String[] args) {

        //System.out.println(Employee.COMPANY_NAME); // ABC
        //Employee.COMPANY_NAME="XYZ"; // error
        //Employee.tnrName = "Nag";

        Employee e1 = new Employee(101);
        //e1.id=101;
        e1.name = "E1";
        e1.salary = 1000.00;
        System.out.println(e1.id); // 0
        System.out.println(e1.name); // null
        System.out.println(e1.salary); // 0.0

        Employee e2 = new Employee(101, "E2");
//        e2.id=102;
//        e2.name="Riya";
        e2.salary = 2000.00;
        System.out.println(e2.id); // 0
        System.out.println(e2.name); // null
        System.out.println(e2.salary); // 0.0

        Employee e3 = new Employee(101, "E3", 3000.00);
//        e3.id=103;
//        e3.name="Riya";
//        e3.salary=3000.00;
        System.out.println(e3.id); // 0
        System.out.println(e3.name); // null
        System.out.println(e3.salary); // 0.0

        //Employee.doTeach();


    }
}
