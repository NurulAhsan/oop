package com.cryptenet.thanatos.oop.polymorphism;

class Shape {
    protected double perimeter;
    protected double area;

    public void move() {
        System.out.println("Moving Shape...");
    }

    public void draw() {
        System.out.println("Drawing Shape...");
    }
}
