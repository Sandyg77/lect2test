package com.oop.iit.Week4;

public abstract class Shape {

    // Constant
    public static final String TAG = "Shape";
    private String color;

    public Shape() {

    }

    /*
    * Draws the shape that has been created
    */
    public abstract void draw();

    public Shape(String color) {
        this.color = color;
    }

    /*
    * @param height
    * @param width
    * */


    // Area for rectangles
    public abstract double getArea(double height, double width);

    // Area for circles
    public  abstract double  getArea(double radius);

    // The behaviour is written by overriding

    // Just a random method
    public void printSomething(){
        System.out.println("Something...");
    }

    public String getColor() {
        return color;
    }
}
