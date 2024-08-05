package com.example.colln.model;

public class Owner {
    private String name;
    private String address;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        // custom hashing algorithm on name
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Owner) {
            Owner other = (Owner) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    public String toString() {
        return "Owner [name=" + name + ", address=" + address + "]";
    }
}
