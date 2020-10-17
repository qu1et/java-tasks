package com.prac.isavgwhole;

import java.util.Scanner;
import java.util.Arrays;

public class IsAvgWhole {
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
        System.out.println(isAvgWhole(arr));
    }

    /* Check is the average of all elements of the array an integer */
    public static boolean isAvgWhole(double[] inputArray) {
        /* Get the average of all elements of the array */
        double avg = Arrays.stream(inputArray).average().getAsDouble();

        /* If an average of all elements of the array is an integer return true
        *  else return false
        */
        return (avg % 1 == 0) ? true : false;
    }
}
