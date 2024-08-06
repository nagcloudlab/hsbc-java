package com.example;


class A {
    int j;
}

class B extends A {
    int i;

}

public class Q {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.j);

    }
}
