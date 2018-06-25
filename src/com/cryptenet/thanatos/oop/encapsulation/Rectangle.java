package com.cryptenet.thanatos.oop.encapsulation;

class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        perimeter = 2 * (width + height);
        area =  width * height;
    }

    public void move() {
        System.out.println("Sliding...");
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
