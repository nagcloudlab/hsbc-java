package com.example.pattern;

class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;
    public Customer(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}


public class Builder {

    public static void main(String[] args) {

        Customer c1 = new Customer("John", "123 Main St", "123-456-7890", "john@mail.com");

        /*

            Customer c1=new Customer.Builder()
                .name("John")
                .phone("123-456-7890")
                .address("123 Main St")

         */

    }

}
