package com.example.fp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {


//        List<String> menu = new ArrayList<>();
//        menu.add("non-veg");
//        menu.add("veg");
//        menu.add("veg");
//        menu.add("non-veg");
//        menu.add("veg");
//        menu.add("non-veg");
//        menu.add("veg");

        //way-1 : Imperative way

//        Iterator<String> it = menu.iterator();
//        while (it.hasNext()) {
//            String item = it.next();
//            if (item.equals("veg")) {
//                it.remove();
//            }
//        }
//
//        System.out.println(menu);

        //way-2 : Declarative way
//        menu.removeIf(item -> item.equals("veg"));
//        System.out.println(menu);

        //-------------------------------------------

        List<String> menu = new ArrayList<>();
        menu.add("Paneer");
        menu.add("Chicken");
        menu.add("Mutton");
        menu.add("Fish");
        menu.add("Aalu");

        // Remove all Veg items
        //menu.removeIf(item -> FoodUtil.isVeg(item));
        menu.removeIf(FoodUtil::isVeg); // Method reference

        System.out.println(menu);


    }
}

class FoodUtil {
    public static boolean isVeg(String item) {
        return item.equals("Paneer") || item.equals("Aalu");
    }
}