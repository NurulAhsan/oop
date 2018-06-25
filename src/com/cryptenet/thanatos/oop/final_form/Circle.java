package com.cryptenet.thanatos.oop.final_form;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.1416 * radius;
    }

    @Override
    public double getArea() {
        return 3.1416 * radius * radius;
    }

    @Override
    public void move() {
        System.out.println("Rolling...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
