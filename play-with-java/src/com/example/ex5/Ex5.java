package com.example.ex5;

class Food {
    public String getFood() {
        boolean isFoodReady = true;
        String food = null;
        if (isFoodReady)
            food = "Food is ready";
        else
            food = "Food is not ready";
        return food;
    }
}

public class Ex5 {
    public static void main(String[] args) {

        Food food = new Food();
        System.out.println(food.getFood());

    }
}
