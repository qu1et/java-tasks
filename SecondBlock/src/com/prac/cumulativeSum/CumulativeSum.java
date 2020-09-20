package com.prac.cumulativeSum;

import java.util.Scanner;
import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        /* Read a quantity of array elements */
        System.out.println("Enter the size of the array: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer!");
            System.exit(0);
        }

        /* Create an arrays of the numbers */
        int[] arr = new int[n];

        /* Fill an array with numbers */
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            } else {
                System.out.println("Wrong input! We need a number!");
                System.exit(0);
            }
        }

        /* Print the result */
        System.out.println(Arrays.toString(cumulativeSum(arr)));
    }

    /* Create an array where every element is cumulated the previous */
    public static int[] cumulativeSum(int[] inputArray) {
        /* Accumulator */
        int sum = 0;
        /* New array */
        int[] newArr = new int[inputArray.length];

        /* Iterate an array and fill the new array */
        for (int i = 0; i < inputArray.length; i++) {
            /* Sum the current element with the sum of the previous */
            sum += inputArray[i];
            /* Push the sum in the new array */
            newArr[i] = sum;
        }

        /* Return a new array */
        return newArr;
    }
}
