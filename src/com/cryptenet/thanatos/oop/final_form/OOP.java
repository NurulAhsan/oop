package com.cryptenet.thanatos.oop.final_form;

public class OOP {
    public static void main(String[] args) {
        Shape circle = new Circle(5);

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
        circle.move();
        circle.draw();

        Shape rectangle = new Rectangle(5, 10);

        System.out.println("Rectangular Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangular Area: " + rectangle.getArea());
        rectangle.move();
        rectangle.draw();
    }
}
