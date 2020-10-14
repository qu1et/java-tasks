package com.prac.bell;

import java.util.Scanner;

public class Bell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a number */
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        /* Print the result */
        System.out.println(getBellNumber(num));
    }

    public static int getBellNumber(int n) {
        double res = 0;

        for (int i = 0; i <= n; i++) {
            res += getStirling(n, i);
        }

        return (int)res;
    }

    public static double getStirling(int n, int k) {
        if (n == k) {
            return 1;
        }

        if (k == 0) {
            return 0;
        } else {
            return getStirling(n - 1, k - 1) + k * getStirling(n - 1, k);
        }
    }
}
