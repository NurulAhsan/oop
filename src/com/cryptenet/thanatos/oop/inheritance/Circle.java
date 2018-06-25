package com.cryptenet.thanatos.oop.inheritance;

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
        perimeter = 2 * 3.1416 * radius;
        area = 3.1416 * radius * radius;
    }

    void move() {
        System.out.println("Rolling...");
    }

    void draw() {
        System.out.println("Drawing Circle...");
    }
}
