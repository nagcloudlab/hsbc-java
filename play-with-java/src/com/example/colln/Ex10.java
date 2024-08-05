package com.example.colln;

import java.util.*;

public class Ex10 {

    public static void main(String[] args) {


        // Stack is a subclass of Vector class

//        Stack<String> stack = new Stack<>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//        stack.push("D");

        // peak() - returns the top element of the stack
        //System.out.println("Top element: " + stack.peek());

        // pop() - removes the top element of the stack
        //System.out.println("Removed element: " + stack.pop());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }


        // Queue

        // LinkedList is a class that implements List and Queue interfaces

        Queue<String> queue = new java.util.LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        // peek() - returns the top element of the queue
        //System.out.println("Top element: " + queue.peek());

        // poll() - removes the top element of the queue

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        // Priority Queue

//        Queue<String> priorityQueue = new java.util.PriorityQueue<>();
//        priorityQueue.offer("A");
//        priorityQueue.offer("C");
//        priorityQueue.offer("B");
//        priorityQueue.offer("D");
//
//        while (!priorityQueue.isEmpty()) {
//            System.out.println(priorityQueue.poll());
//        }


        // Deque

        // ArrayDeque is a class that implements Deque interface

        // Deque is a double-ended queue

//        Deque<String> deque = new java.util.ArrayDeque<>();


        //------------------------------------

        //Hashtable<String, String> hashtable = new Hashtable<>(); // Hashtable is a synchronized class

        // HashMap is not synchronized

        //-----------------------------------

//        Properties properties = new Properties();
//        properties.setProperty("db.ul", "jdbc:mysql://localhost:3306/test");
//        properties.setProperty("db.user", "root");
//        properties.setProperty("db.password", "root");

        //-----------------------------------

//
//        List<String> menu = new ArrayList<>();
//        menu.add("paneer");
//        menu.add("chapathi");
//        menu.add("rice");
//
//        List<String> newMenu=Collections.unmodifiableList(menu);
//
//        newMenu.add("dosa");

        //-----------------------------------------


//        List<String> menu=List.of("paneer","chapathi","rice");
//        menu.add("dosa");

        //-----------------------------------------



    }

}
