package com.cryptenet.thanatos.oop.abstraction;

public class OOP {
    public static void main(String[] args) {
        radius = 5;

        System.out.println("Circle Perimeter: " + getCirclePerimeter());
        System.out.println("Circle Area: " + getCircleArea());

        width = 5;
        height = 10;

        System.out.println("Rectangular Perimeter: " + getRectanglePerimeter());
        System.out.println("Rectangular Area: " + getRectangleArea());
    }

    static int radius;

    static double getCirclePerimeter() {
        return 2 * 3.1416 * radius;
    }

    static double getCircleArea() {
        return 3.1416 * radius * radius;
    }

    static int width;
    static int height;

    static int getRectanglePerimeter() {
        return 2 * (width + height);
    }

    static int getRectangleArea() {
        return width * height;
    }
}
