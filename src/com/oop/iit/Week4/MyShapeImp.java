package com.oop.iit.Week4;
// In this example all 4 OOP concepts are used.


//Using the implements keyword
// can implement multiple interfaces - allowing multiple inheritance
public class MyShapeImp implements CircleImpl {
    public static void main(String[] args) {

        Circle circle = new Circle();
        // Also can be written as Shape circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle();

        System.out.println(circle.getArea(5.0));
        System.out.println(rectangle.getArea(7.0, 10));


    }

    @Override
    public void printShapes() {
        // Escape sequence with the backSlash since a backslash is needed
        System.out.println("printing Shape");
    }
}
