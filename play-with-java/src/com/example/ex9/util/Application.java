package com.example.ex9.util;

public class Application {
    public static void main(String[] args) {

        addDataElements(new ArrayList());
        addDataElements(new LinkedList());

    }

    private static void addDataElements(List list) {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("List elements: " + list);

    }
}
