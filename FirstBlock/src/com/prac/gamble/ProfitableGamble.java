package com.prac.gamble;

import java.util.Scanner;

public class ProfitableGamble {
    public static void main(String[] args) {
        double prob = 0, prize = 0, pay = 0;

         /* Base and height input
           If input is not a number finish program
        */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter prob, prize and pay: ");

            if (scanner.hasNextDouble()) {
                prob = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                prize = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }

            if (scanner.hasNextDouble()) {
                pay = scanner.nextDouble();
            } else {
                System.out.println("You didn't enter a number!");
                System.exit(0);
            }
        }

        /* Check is the gamble is profitable and print the answer */
        System.out.println(isProfitable(prob, prize, pay));
    }

    public static boolean isProfitable(double prob, double prize, double pay) {
        return (prob * prize > pay);
    }

}
