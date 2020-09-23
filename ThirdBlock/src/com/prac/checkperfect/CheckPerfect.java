package com.prac.checkperfect;

import java.util.Scanner;

public class CheckPerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        /* Read a number */
        System.out.println("Enter a number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(isPerfect(num));
    }

    /* Check is number perfect */
    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return n == sum;
    }
}
