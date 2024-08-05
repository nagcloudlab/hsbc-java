package com.example.colln.model;

public class Apple implements Comparable<Apple> {

    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Apple o) {
        //return this.weight-o.weight;
        return o.weight-this.weight;
    }

    @Override
    public String toString() {
        return "Apple{" + "color=" + color + ", weight=" + weight + '}';
    }


}
