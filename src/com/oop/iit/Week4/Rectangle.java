package com.oop.iit.Week4;

public class Rectangle extends Shape{
    private double height;
    private double width;



    @Override
    public void draw() {
        System.out.println("|_|");
    }

    @Override
    public double getArea(double height, double width) {
        return height * width;
    }

    // This is for circles
    @Override
    public double getArea(double radius) {
        return 0;
    }
}
