package com.prac.operation;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        double a = 0, b = 0, N = 0;

        /* a, b and N numbers input
           If input is not a number finish program
        */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a, b and N: ");

            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                N = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }
        }

        /* Define an operation and print it */
        System.out.println(defineOperation(a, b, N));
    }

    public static String defineOperation(double a, double b, double N) {
        if (a + b == N) {
            return "Added";
        } else if (Math.abs(a - b) == Math.abs(N)) {
            return "Substracted";
        } else if (a * b == N) {
            return "Multiplied";
        } else if (a / b == N || b / a == N) {
            return "Divided";
        } else {
            return "none";
        }
    }
}
