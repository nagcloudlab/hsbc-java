package com.example.colln;

import java.util.Iterator;
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

// data structure/collection + iterator
// iterator = how to iterate over the elements of a collection
// collection + iterator = Iterable

class LinkedList<T> implements Iterable<T> {
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

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public T get(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Iterator<T> iterator() {
        return new Iterator() {
            private Node<T> temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T data = temp.data;
                temp = temp.next;
                return data;
            }
        };
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


//        Trainer<Java> javaTrainer = new Trainer<>();
//        javaTrainer.setSubject(new Java());
//
//        Trainer<Python> pythonTrainer = new Trainer<>();
//        pythonTrainer.setSubject(new Python());

        //Trainer<String> stringTrainer = new Trainer<>();


        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");

        //

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // for each loop ( enhanced for loop ) java 5
        for (String s : list) {
            System.out.println(s);
        }


    }
}
