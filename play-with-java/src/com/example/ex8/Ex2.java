package com.example.ex8;

// imp-note : by default string object is immutable
// immutable means we can't change the content of string object once we create

public class Ex2 {

    public static void main(String[] args) {

        String s1="hsbc";
        String s2=s1.concat("-pune");
        System.out.println(s1);
        System.out.println(s2);

    }

}
