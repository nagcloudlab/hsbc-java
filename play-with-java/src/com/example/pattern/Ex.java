package com.example.pattern;

/*

    design issues
    ---------------

    -> mix of concerns / code tangling / code coupling
    -> code scattering / duplicate code

 */

class Greeting {
    public void hello() {
        System.out.println("Hello");
        System.out.println("😀");
    }

    public void hi() {
        System.out.println("Hi");
        System.out.println("😀");
    }
}


public class Ex {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        greeting.hello();
        greeting.hi();


    }
}
