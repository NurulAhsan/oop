package com.cryptenet.thanatos.oop.inheritance;

public class OOP {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Circle Perimeter: " + circle.perimeter);
        System.out.println("Circle Area: " + circle.area);
        circle.move();
        circle.draw();

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Rectangular Perimeter: " + rectangle.perimeter);
        System.out.println("Rectangular Area: " + rectangle.area);
        rectangle.move();
        rectangle.draw();
    }
}
