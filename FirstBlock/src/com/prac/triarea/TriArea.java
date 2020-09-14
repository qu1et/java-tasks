package com.prac.triarea;

import java.util.Scanner;

public class TriArea {
    public static void main(String[] args) {
        double base = 0, height = 0;

        /* Base and height input
           If input is not a number finish program
        */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter numbers base and height: ");

            if (scanner.hasNextDouble()) {
                base = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }
        }

        /* Print area of a triangle */
        System.out.format("Area of a triangle: %.2f", triArea(base, height));
    }

    /* Compute area of triangle with base and height */
    public static double triArea(double a, double h) {
        return ((a * h) / 2);
    }
}
