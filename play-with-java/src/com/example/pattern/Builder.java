package com.example.pattern;

class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;

    Customer(String name){
        //this.name = name;
        this(name, "", "", "");
    }

    Customer(String name, String address){
//        this.name = name;
//        this.address = address;
        this(name, address, "", "");
    }


    Customer(String name, String address, String phone){
//        this.name = name;
//        this.address = address;
//        this.phone = phone;
        this(name, address, phone, "");
    }

    Customer(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

}


public class Builder {

    public static void main(String[] args) {


        // without builder

        Customer customer = new Customer("John", "123 Main St", "123-456-7890", "j@mail.com");

        // with builder
//
//        Customer customer1 = new Customer("John")
//                .address("123 Main St")
//                .phone("123-456-7890")
//                .email("j@mail.com")
//                .build();

    }

}
