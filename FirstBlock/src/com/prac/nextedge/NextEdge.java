package com.prac.nextedge;

import java.util.Scanner;

public class NextEdge {
    public static void main(String[] args) {
        double a = 0, b = 0;

        /* Read lengths of two triangle ribs */
        System.out.println("Enter lengths of two triangle ribs:");
        try (Scanner scanner = new Scanner(System.in)) {
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
        }

        /* Print max length of the third rib */
        System.out.println(nextEdge(a, b));
    }

    public static double nextEdge(double a, double b) {
        return a + b - 1;
    }
}
