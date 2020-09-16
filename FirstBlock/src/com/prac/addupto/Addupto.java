package com.prac.addupto;

import java.util.Scanner;

public class Addupto {
    public static void main(String[] args) {
        double num = 0;

        /* Read a number */
        System.out.println("Enter a number:");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number");
                System.exit(0);
            }
        }

        /* Print sum of the numbers from 1 to num */
        System.out.println(addUpTo(num));
    }

    public static double addUpTo(double n) {
        return (n * (n + 1)) / 2;
    }
}
