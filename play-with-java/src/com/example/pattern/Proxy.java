package com.example.pattern;

/*

    design issues
    ---------------

    -> mix of concerns / code tangling / code coupling
    -> code scattering / duplicate code

 */


/*
    proxy design pattern
    ----------------------

    -> proxy is a design pattern that allows
       an object to act as an interface to another object
    ->  proxy is a wrapper or agent object that is called
       by the client to access the real object behind the scenes
    -> proxy is used to provide controlled access of the real object

    Summary:
    with Single Responsibility Principle,
        we can separate the concerns of the system
        into multiple classes

 */

class Greeting {
    public void hello() {
        System.out.println("Hello");
    }

    public void hi() {
        System.out.println("Hi");
    }
}

class Auth{
    public boolean isAuthorized(){
        return true;
    }
}

class Emoji{
    public void smile() {
        System.out.println(":)");
    }
}

class GreetingProxy extends Greeting {

    //private Greeting greeting = new Greeting();
    private Auth auth = new Auth();
    private Emoji emoji = new Emoji();

    public void hello() {
        if (auth.isAuthorized()) {
            //greeting.hello();
            super.hello();
            emoji.smile();
        } else {
            System.out.println("Not Authorized");
        }
    }

    public void hi() {
        if (auth.isAuthorized()) {
            //greeting.hi();
            super.hi();
            emoji.smile();
        } else {
            System.out.println("Not Authorized");
        }
    }
}



public class Proxy {
    public static void main(String[] args) {

        // For internal client
        Greeting greeting = new Greeting();
        greeting.hello();

        // For external client
        GreetingProxy proxy = new GreetingProxy();
        proxy.hello();
        proxy.hi();




    }
}
