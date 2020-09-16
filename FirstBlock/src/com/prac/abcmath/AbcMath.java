package com.prac.abcmath;

import java.util.Scanner;

public class AbcMath {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;

        /* Read a numbers */
        System.out.println("Enter a, b and c:");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.out.println("This is not a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.out.println("This is not a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.out.println("This is not a number!");
                System.exit(0);
            }
        }

        /* Print result */
        System.out.println(abcMath(a, b, c));
    }

    public static String abcMath(double a, double b, double c) {
        double sum = a;

        for (int i = 0; i < b; i++) {
            sum += sum;
        }

        return (sum % c == 0) ? sum + " is divisible by " + c :
                                sum + " is not divisible by " + c;
    }
}
