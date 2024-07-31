package com.example.oo.ex4;


class Employee {

    static int helloCount = 0; // class variable, retains in method/metaspace area

    int empId;
    String empName;
//    int helloCount = 0; // instance variable, retains in heap memory

    Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    void sayHello() {
//        int helloCount = 0; // local variable , retains in stack memory
        helloCount++;
        System.out.println("Hello, I am " + empName + " (" + helloCount + ")");
    }
}

public class VariableScope {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Jane");
        Employee emp3 = new Employee(3, "Jim");

        emp1.sayHello();

        emp2.sayHello();
        emp2.sayHello();

        emp3.sayHello();
        emp3.sayHello();
        emp3.sayHello();

    }
}
