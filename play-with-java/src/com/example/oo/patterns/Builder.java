package com.example.oo.patterns;

// builder pattern
// - to create object with mandatory & optional properties
// - to create immutable objects
// - to create objects with large number of properties
// - to create objects with complex construction
// - to create objects with default values

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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String address = "one earth";
        private String phone = "";
        private String email = "";

        public Builder(String name) {
            this.name = name;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Customer build() {
            return new Customer(name, address, phone, email);
        }
    }

}


public class Builder {

    public static void main(String[] args) {


        // without builder
        Customer customer = new Customer("John", "123 Main St", "123-456-7890", "j@mail.com");

        // with builder
        Customer customer1 = new Customer.Builder("Nag")
                .email("nag@mail.com")
                .phone("123-456-7890")
                .address("123 Main St")
                .build();
        System.out.println(customer1);

    }

}
