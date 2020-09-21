package com.prac.solutions;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0, c = 0;

        /* Read numbers */
        /* Read x */
        System.out.println("Enter a, b and c:");
        if (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Read y */
        if (scanner.hasNextDouble()) {
            y = scanner.nextDouble();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Read c */
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(getSolution(x, y, c));
    }

    /* Compute */
    public static int getSolution(double a, double b, double c) {
        double result = Math.sqrt(b * b - (4 * a * c));

        if (result > 0) {
            return 2;
        } else if (result == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
