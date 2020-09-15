package com.prac.animals;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        int chickens = 0, cows = 0, pigs = 0;

        /* Base and height input
           If input is not a number finish program
        */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter numbers quantity of chickens, cows and pigs: ");

            if (scanner.hasNextInt()) {
                chickens = scanner.nextInt();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextInt()) {
                cows = scanner.nextInt();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextInt()) {
                pigs = scanner.nextInt();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }
        }

        /* Compute quantity of all animals legs and print */
        System.out.format("Quantity of all animals legs: %d", countLegs(chickens, cows, pigs));
    }

    public static int countLegs(int a, int b, int c) {
        return (a * 2 + b * 4 + c * 4);
    }
}
