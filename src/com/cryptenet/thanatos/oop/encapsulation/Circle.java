package com.cryptenet.thanatos.oop.encapsulation;

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
        perimeter = 2 * 3.1416 * radius;
        area = 3.1416 * radius * radius;
    }

    public void move() {
        System.out.println("Rolling...");
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
