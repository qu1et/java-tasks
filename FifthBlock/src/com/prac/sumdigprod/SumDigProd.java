package com.prac.sumdigprod;

import java.util.Scanner;

public class SumDigProd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read amount of array elements */
        System.out.println("Enter amount of numbers");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        /* Read numbers */
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        /* Print the result */
        System.out.println(sumDigProd(arr));
    }

    public static int sumDigProd(int[] arr) {
        int sum = 0;

        for (int elem: arr) {
            sum += elem;
        }

        while (sum > 9) {
            int s = 1;

            for (; sum > 0; sum /= 10) {
                s *= sum % 10;
            }

            sum = s;
        }

        return sum;
    }
}
