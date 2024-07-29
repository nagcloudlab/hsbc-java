package com.example.ex9;

/*
 types of objects
    -> a object with business methods ( e.f bill, PM , .. )
    -> a object with data ( e.g. student, employee, .. )
 */

/*

    some points to apple on data objects

    -> immutability
    -> getter methods
    -> equals and hashcode
    -> comparable
    -> serializable
    -> toString



 */


/*

    record class

    -> a record class is a data class
    -> a record class is a final class
    -> a record class is a immutable class
    -> a record class is a serializable class
    -> a record class is a comparable class
    -> a record class is a toString class
    -> a record class has equals and hashcode class
    -> a record class is a getter class


 */


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
//
//final class Employee extends Object implements Comparable<Employee>, Serializable {
//    final int id;
//    final String name;
//    final double salary;
//
//    Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Employee) {
//            Employee emp = (Employee) obj;
//            return this.id == emp.id && this.name.equals(emp.name) && this.salary == emp.salary;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//    @Override
//    public int compareTo(Employee o) {
//        return this.id - o.id;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//
//}
//

record Employee(int id, String name, double salary) implements Comparable<Employee>, Serializable {
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

// reference : https://www.baeldung.com/java-record-keyword

public class Ex4 {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "A", 10000);
        Employee emp2 = new Employee(1, "B", 20000);

        System.out.println(emp1 == emp2); // false
        System.out.println(emp1.equals(emp2)); // false


        processEmployee(emp1);
        processEmployee(emp2);

    }

    private static void processEmployee(Object obj) {
        if (obj instanceof Employee e) {
            System.out.println(e.id());
            System.out.println(e.name());
            System.out.println(e.salary());
        }
    }
}
