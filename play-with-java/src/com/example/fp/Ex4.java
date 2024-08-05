package com.example.fp;


import java.util.function.*;


interface ThreeParamFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class Ex4 {
    public static void main(String[] args) {


        //  create function takes a string and returns boolean
        Predicate<String> isLong = s -> s.length() > 10;
        BiPredicate<String, Integer> isLongerThan = (s, length) -> s.length() > length;
        // create function takes a string and returns string
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        Function<String, Integer> length = s -> s.length();
        BiFunction<String, Integer, String> repeat = (s, n) -> s.repeat(n);
        // create function takes a string and returns void
        Consumer<String> print = s -> System.out.println(s);
        BiConsumer<String, Integer> printN = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        // create function takes a no-arg and returns string
        Supplier<String> getHello = () -> "Hello";


        UnaryOperator<String> toUpperCase2 = s -> s.toUpperCase();
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;

        // need function shud take 2 int and return int
        //BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        //System.out.println(add.apply(10, 20));

        IntBinaryOperator add = (a, b) -> a + b;
        LongBinaryOperator addLong = (a, b) -> a + b;
        DoubleBinaryOperator addDouble = (a, b) -> a + b;


        ThreeParamFunction<Integer, Integer, Integer, Integer> add3 = (a, b, c) -> a + b + c;
        System.out.println(add3.apply(10, 20, 30));


    }
}
