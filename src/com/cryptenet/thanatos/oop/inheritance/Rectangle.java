package com.cryptenet.thanatos.oop.inheritance;

class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        perimeter = 2 * (width + height);
        area =  width * height;
    }

    void move() {
        System.out.println("Sliding...");
    }

    void draw() {
        System.out.println("Drawing Circle...");
    }
}
