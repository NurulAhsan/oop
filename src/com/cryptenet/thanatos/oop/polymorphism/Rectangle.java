package com.cryptenet.thanatos.oop.polymorphism;

class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        perimeter = 2 * (width + height);
        area =  width * height;
    }

    @Override
    public void move() {
        System.out.println("Sliding...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
