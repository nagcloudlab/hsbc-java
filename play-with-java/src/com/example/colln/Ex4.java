package com.example.colln;


// List colln methods

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // add element to end
        list.add("Element 1");
        list.add("Element 1");
        list.add("Element 2");


        // add element at index
        //list.add(1, "Element 3");

        // add all elements from another list
        //List<String> anotherList = new ArrayList<>();
        //anotherList.add("Element 4");
        //list.addAll(anotherList);

        // add all elements from another list at index
        //List<String> yetAnotherList = new ArrayList<>();
        //yetAnotherList.add("Element 5");
        //list.addAll(1, yetAnotherList);


        // remove element at index
        //list.remove(1);
        //list.remove("Element 1");


        // iterate over list
        for (String element : list) {
            //System.out.println(element);
        }

        //--------------------------------

        List<String> sheet1 = new ArrayList<>();
        sheet1.add("A1");
        sheet1.add("B1");
        sheet1.add("C1");
        sheet1.add("D1");

        List<String> sheet2 = new ArrayList<>();
        sheet2.add("A1");
        sheet2.add("B1");
        sheet2.add("C2");
        sheet2.add("D2");
        sheet2.add("E2");

        //sheet1.removeAll(sheet2);
        //sheet1.retainAll(sheet2);

        //System.out.println(sheet1);

        //System.out.println(sheet1.contains("A1"));
        //System.out.println(sheet1.containsAll(sheet2));

        //System.out.println(sheet1.subList(1, 3));


//        Iterator<String> iterator = sheet1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        ListIterator<String> listIterator = sheet1.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }

}
