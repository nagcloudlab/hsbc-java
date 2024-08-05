package com.example.fp;


import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

class Foo {
    static void m1() {
        System.out.println("m1");
    }

    static void m2(int a) {
        System.out.println("m2");
        System.out.println(a);
    }

    static void m3(int a, String b) {
        System.out.println("m3");
    }
}

class Bar {
    void m1() {
        System.out.println("m1");
    }

    void m2(int a) {
        System.out.println("m2");
        System.out.println(a);
    }

    void m3(int a, String b) {
        System.out.println("m3");
    }
}


class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class MethodReferenceEx {
    public static void main(String[] args) {

        // method reference
        // use existing method as lambda
        Runnable rr = () -> Foo.m1();
        Runnable r = Foo::m1;
        Thread t = new Thread(r);
        t.start();

        // method reference
        Consumer<Integer> c = Foo::m2;
        c.accept(10);


        // method reference
        BiConsumer<Integer, String> c1 = Foo::m3;


        //----------------------------------------

        Bar bar = new Bar();
        Runnable r3 = bar::m1;

        //----------------------------------------


        Function<String, Employee> f = name -> new Employee(name);
        Function<String, Employee> f1 = Employee::new;

        BiFunction<String, Integer, Employee> f2 = Employee::new;

        //----------------------------------------


        Comparator<Integer> c2 = (i1, i2) -> Integer.compare(i1, i2);
        Comparator<Integer> c3 = Integer::compare;

        //----------------------------------------

    }
}
