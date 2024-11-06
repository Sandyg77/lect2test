package Week5.ExceptionHandling;

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
    }
}
