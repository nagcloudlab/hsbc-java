package com.example.colln;

import java.util.List;

interface Subject {
}

class Java implements Subject {
}

class Python implements Subject {
}

class Trainer<S extends Subject> {
    private S subject;

    public void setSubject(S subject) {
        this.subject = subject;
    }

    public S getSubject() {
        return subject;
    }
}


class LinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}


public class Ex2 {
    public static void main(String[] args) {


        Trainer<Java> javaTrainer = new Trainer<>();
        javaTrainer.setSubject(new Java());


        Trainer<Python> pythonTrainer = new Trainer<>();
        pythonTrainer.setSubject(new Python());

        //Trainer<String> stringTrainer = new Trainer<>();

        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);


    }
}
