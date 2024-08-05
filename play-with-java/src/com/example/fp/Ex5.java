package com.example.fp;

// FP principles

/*

        - A function can be stored in a variable
        - A parameter of a function can be a function
        - The return value of a function can be a function


 */

import java.util.function.Predicate;

public class Ex5 {

    private static Predicate<String> and(Predicate<String> f1, Predicate<String> f2) {
        return name -> {
            return f1.test(name) && f2.test(name);
        };
    }

    public static void main(String[] args) {


        Predicate<String> isMinLength = (name) -> name.length() > 5;
        Predicate<String> isMaxLength = (name) -> name.length() < 10;

        Predicate<String> isMinAndMaxLength = and(isMinLength, isMaxLength);

        String s="Hello";
        System.out.println(isMinAndMaxLength.test(s));

    }

}
