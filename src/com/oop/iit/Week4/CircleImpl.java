package com.oop.iit.Week4;
// All methods in interfaces are abstract, so it does not need to have the keywords
public interface CircleImpl {

    /*
    * Prints multiple shapes of the object
    * */

     void printShapes();

     // This methods cannot be overridden the default keyword is immutable
     default void printAnotherThing(){
          System.out.println("Another thing...");
     }
}
