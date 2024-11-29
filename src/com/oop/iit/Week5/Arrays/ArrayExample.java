package com.oop.iit.Week5.Arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = new int[5];
        // Object literals are null and for integers its gonna be zero
        System.out.println(Arrays.toString(scores));


        // How to assign values to the array
        scores[0] = 5;
        scores[1] = 10;
        scores[2] = 7;
        System.out.println(Arrays.toString(scores));

        // if printed without toString method the object (memory) reference is printed
        System.out.println(scores);


        // Another way of declaring an array
        int [] nums = {3,7,5,9};
        System.out.println(Arrays.toString((nums)));


        // Without using a try catch block we can use the length method easily eg : scores.length


        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(scores[i]);
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("An error occurred while trying to loop the array!");
        }

        printArray(scores);
    }

    public static void printArray(int [] array){
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("An error occurred while trying to loop the array!");
        }
    }

    // Try array of objects
}
