package com.prac.trouble;

import java.util.Scanner;

public class Trouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fst = 0, scnd = 0;

        /* Read the first number */
        System.out.println("Enter the first number");
        if (scanner.hasNextLong()) {
            fst = scanner.nextLong();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        /* Read the second number */
        System.out.println("Enter the second number");
        if (scanner.hasNextLong()) {
            scnd = scanner.nextLong();
        } else {
            System.out.println("Wrong input! We need an integer number");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(findTrouble(fst, scnd));
    }

    public static boolean findTrouble(long n1, long n2) {
        long threeInRow = 0;
        long twoInRow = 0;
        int row = 1;
        long num = n1 % 10;
        n1 /= 10;

        while (n1 > 0) {
            if (num == n1 % 10) {
                row++;
            } else if (row == 3) {
                threeInRow = num;
                row = 1;
            } else {
                row = 1;
            }

            num = n1 % 10;
            n1 /= 10;
        }

        if (row == 3) {
            threeInRow = num;
        }

        num = n2 % 10;
        n2 /= 10;

        while (n2 > 0) {
            if (num == n2 % 10) {
                row++;
            } else if (row == 2) {
                if (num == threeInRow) {
                    return true;
                }
                twoInRow = num;
                row = 1;
            } else {
                row = 1;
            }

            num = n2 % 10;
            n2 /= 10;
        }

        if (row == 2) {
            twoInRow = num;
        }

        return threeInRow == twoInRow;
    }
}
