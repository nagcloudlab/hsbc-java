package com.example.annotation;

import com.example.annotation.container.WebContainer;

public class Ex2 {

    public static void main(String[] args) {

        WebContainer container = new WebContainer();
        container.processRequest("/register");
        container.processRequest("/login");

    }

}
