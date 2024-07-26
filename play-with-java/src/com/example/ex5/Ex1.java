package com.example.ex5;

// function vs method

// function
// function is a block of code that performs a specific task
// method
// method is a function that is associated with an object


class Xyz {
    static void staMethod() {
        System.out.println("Hello");
    }

    void instMethod() {
        System.out.println("Hello");
    }
}


// coding rules for method overloading
// 1. method name should be same
// 4. method modifier can be same or different
// 2. method return type should be same or different
// 5. method parameter list should be different
//    - number of parameters
//    - type of parameters
//    - order of parameters
class Actor {

    void act() {
        System.out.println("simple act");
    }

    void act(int pay) {
        System.out.println("over acting");
    }

}


public class Ex1 {
    public static void main(String[] args) {

        Actor actor = new Actor();
        actor.act();
        actor.act(1000);

        System.out.println("Hello");
        System.out.println(10);
        System.out.println(10.5);
        System.out.println(true);
        System.out.println('A');

    }
}
