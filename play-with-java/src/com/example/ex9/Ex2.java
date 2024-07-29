package com.example.ex9;


// Interface with static method

interface  MathOperation {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
}

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Addition: " + MathOperation.add(10, 5));
        System.out.println("Subtraction: " + MathOperation.subtract(10, 5));
        System.out.println("Multiplication: " + MathOperation.multiply(10, 5));
        System.out.println("Division: " + MathOperation.divide(10, 5));

    }
}
