package com.cryptenet.thanatos.oop.final_form;

public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void move();

    public void draw(){
        System.out.println("Drawing Shape...");
    }
}
