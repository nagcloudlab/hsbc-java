package com.example.ex9.util;

// 2022-07-07

public class LinkedList extends AbstractList implements List {

    private Node head;

    public LinkedList() {
        head = null;
    }

    @Override
    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    @Override
    public void remove(String obj) {
        if (head == null) {
            return;
        }
        if (head.getData().equals(obj)) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(obj)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }

    }

    @Override
    public boolean contains(String obj) {
        return false;
    }

    @Override
    public void add(int index, String data) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new Node(data, head);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new Node(data, current.getNext()));
        }
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public int indexOf(String obj) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(obj)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
    }

    @Override
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData());
            sb.append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }


    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

}
