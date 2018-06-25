package com.cryptenet.thanatos.oop.polymorphism;

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
        perimeter = 2 * 3.1416 * radius;
        area = 3.1416 * radius * radius;
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
