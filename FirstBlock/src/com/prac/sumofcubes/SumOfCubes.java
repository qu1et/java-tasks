package com.prac.sumofcubes;

import java.util.Scanner;

public class SumOfCubes {

    public Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        /* Read size of the array */
        System.out.println("Enter size of the array");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("This is not a number!");
            System.exit(0);
        }

        /* If length of array is 0 return 0 */
        if (n == 0) {
            System.out.println(0);
            System.exit(0);
        }

        /* Create an array */
        double arr[] = new double[n];

        /* Fill array with numbers */
        System.out.println("Fill array with the numbers:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextDouble()) {
                arr[i] = scanner.nextDouble();
            } else {
                System.out.println("This is not a number!");
                System.exit(0);
            }
        }

        /* Print sum of cubes of the array elements */
        System.out.println(sumOfCubes(arr));
    }

    public static double sumOfCubes(double [] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 3);
        }
        return sum;
    }
}
