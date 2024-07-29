package com.example.ex9.util;

// 2021-07-07

public class ArrayList extends AbstractList implements List {

    private String[] array = new String[10];
    private int size = 0;

    @Override
    public void foo() {
        System.out.println("foo");
    }

    public void add(String s) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = s;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String s) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String s) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(s)) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                size--;
                return;
            }
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public void add(int index, String s) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = s;
        size++;
    }

    public int indexOf(String s) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String s) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

}
