package com.prac.nextprime;

import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        /* Read a number */
        System.out.println("Enter an integer number:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(getNextPrime(num));
    }

    /* Check is it a prime number */
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /* Get next prime number */
    public static int getNextPrime(int n) {
        /* If the given number is prime return it */
        if (isPrime(n)) {
            return n;
        }

        /* Find next prime number */
        for (int i = n; ; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }
}
