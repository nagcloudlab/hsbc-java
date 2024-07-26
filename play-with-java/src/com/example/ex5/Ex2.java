package com.example.ex5;

class Super {
    public void m1() {
        System.out.println("Super m1");
    }
}

class Sub extends Super {
    @Override
    public void m1() {
        System.out.println("Sub m1");
    }
}

// coding rules for overriding
// 1. method name should be same
// 2. method signature should be same
// 3. return type should be same
// 4. access modifier should be same or higher


public class Ex2 {
    public static void main(String[] args) {

        Super s = new Sub();
        s.m1(); // Sub m1

    }
}
