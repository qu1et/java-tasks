package com.prac.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        /* Read a number */
        System.out.println("Enter any positive number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(getFibonacci(num));
    }

    /* Compute Fibonacci number */
    public static int getFibonacci(int n) {
        int prevNum = 0;
        int currNum = 1;
        int fib = 0;

        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            fib = prevNum + currNum;
            prevNum = currNum;
            currNum = fib;
        }

        return fib;
    }
}
