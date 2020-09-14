package com.prac.reminder;

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        double x = 0, y = 0;

        /* Numbers input
           If input is not a number finish program
        */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter numbers x and y: ");

            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                y = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }
        }

        /* If y is zero finish program */
        if (y == 0) {
            System.out.println("You can't divide by zero!");
            System.exit(0);
        }

        /* Print the reminder */
        System.out.format("Reminder: %.1f", getReminder(x, y));
    }

    /* Get reminder the of division x by y */
    public static double getReminder(double x, double y) {
        return x % y;
    }
}
