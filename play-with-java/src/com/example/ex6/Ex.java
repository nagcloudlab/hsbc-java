package com.example.ex6;


interface List {
    void add(int value);
    void remove(int index);
    void set(int index, int value);
    int get(int index);
    int size();
    void clear();
}
abstract class AbstractList implements  List{
    public void clear() {
     //..
    }
}
class ArrayList extends AbstractList implements List {
    @Override
    public void add(int value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
class LinkedList extends AbstractList implements List {
    @Override
    public void add(int value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}


public class Ex {
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

    }
}
