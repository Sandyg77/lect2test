package com.oop.iit.Week5.ExceptionHandling;

import java.util.Scanner;

public class RandomCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = input.nextInt();
        System.out.println("Enter number 2: ");
        int b = input.nextInt();

        // Exception handling - arithmeticException eg: zero division error
        // In one try block we can catch more than 1 exception

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exception) {
            System.out.println("An error occurred while trying to divide numbers!");
        } catch (Exception exception) {
            System.out.println("An unknown error occurred");
        }

        try {
            calculateNumbers(a,b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // When we throw an exception should mention in the method signature
    public static void calculateNumbers(int a, int b) throws Exception {
        if (a == b){
            //Can have custom exceptions as well
            throw new EqualNumberException("A and B should not be equal");
        }
        System.out.println("A + B = " + (a+b));
    }
}
