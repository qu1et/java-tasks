package com.prac.diffmaxmin;

import java.util.Scanner;
import java.util.Arrays;

public class DiffMaxMin {
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

        /* Create an array of the numbers */
        double[] arr = new double[n];

        /* Fill an array with numbers */
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextDouble()) {
                arr[i] = scanner.nextDouble();
            } else {
                System.out.println("Wrong input! We need a number!");
                System.exit(0);
            }
        }

        /* Print the result */
        System.out.format("Difference between max and min: %.1f", differenceMaxMin(arr));
    }

    /* Find maximum and minimum elements and return the difference between them */
    public static double differenceMaxMin(double[] inputArr) {
        /* Finding the max element in the array */
        double max = Arrays.stream(inputArr).max().getAsDouble();
        /* Finding the min element in the array */
        double min = Arrays.stream(inputArr).min().getAsDouble();
        /* Return the difference between them */
        return max - min;
    }
}
