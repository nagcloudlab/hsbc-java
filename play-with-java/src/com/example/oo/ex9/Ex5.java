package com.example.oo.ex9;


/*


sealed Classes

Key Features of Sealed Classes:

Controlled Inheritance:
 By using sealed classes, a class can specify which subclasses are permitted to extend it. This control ensures that all subclasses are known and can be managed, leading to better control over class behavior and security.

Exhaustiveness in Pattern Matching:
 Sealed classes work well with pattern matching, as the compiler can know all possible subclasses. This allows for exhaustiveness checking, ensuring that all cases are handled in a switch expression or similar constructs.

Enhanced Documentation:
    Declaring a class as sealed can serve as documentation, clearly indicating the intended use of the class and its hierarchy.


 */

sealed class Shape permits Circle, Rectangle, Polygon {
}

final class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

final class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

//class Triangle extends Shape{} // Error: Triangle is not permitted here
non-sealed class Polygon extends Shape {
}

final class Triangle extends Polygon {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

//-------------------


sealed class Message permits TextMessage, ImageMessage, VideoMessage {
    // Common properties and methods for all messages
}

final class TextMessage extends Message {
    private final String text;
    // Constructor, getters, and other methods
    public TextMessage(String text) {
        this.text = text;
    }
}

final class ImageMessage extends Message {
    private final byte[] imageData;
    // Constructor, getters, and other methods
    public ImageMessage(byte[] imageData) {
        this.imageData = imageData;
    }
}

final class VideoMessage extends Message {
    private final byte[] videoData;
    // Constructor, getters, and other methods
    public VideoMessage(byte[] videoData) {
        this.videoData = videoData;
    }
}


public class Ex5 {
    public static void main(String[] args) {


    }


}
