package com.oop.iit.Week4;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("()");
    }

    // This is for rectangles so won't be using
    @Override
    public double getArea(double height, double width) {
        return 0;
    }

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;

    }
}
