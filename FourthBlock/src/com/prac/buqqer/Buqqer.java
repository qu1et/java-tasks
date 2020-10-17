package com.prac.buqqer;

import java.util.Scanner;

public class Buqqer {
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
        System.out.println(buqqer(num));
    }

    public static int buqqer(int n) {
        int res = 0;

        if (n < 0) {
            return 0;
        }

        while (n > 9) {
            int s = 1;
            res++;

            for (; n > 0; n /= 10) {
                s *= n % 10;
            }

            n = s;
        }

        return res;
    }
}
