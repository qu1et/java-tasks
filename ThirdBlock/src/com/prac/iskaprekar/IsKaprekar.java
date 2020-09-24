package com.prac.iskaprekar;

import java.util.Scanner;

public class IsKaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        /* Read a number */
        System.out.println("Enter a number:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(isKaprekar(num));
    }

    /* Check is it a Kaprekar number */
    public static boolean isKaprekar(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        String num = String.valueOf(n * n);

        if (num.length() == 1) {
            return false;
        }

        /* Cut string to two pieces */
        String fst = num.substring(0, num.length() / 2);
        String scnd = num.substring(num.length() / 2, num.length());


        return (Integer.parseInt(fst) + Integer.parseInt(scnd)) == n;
    }
}
