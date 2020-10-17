package com.prac.overtime;

import java.util.Scanner;

public class OverTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputData = new double[4];

        /* Read data */
        System.out.println("Enter start time, end time, hourly rate and overtime multiplier");
        for (int i = 0; i < 4; i++) {
            if (scanner.hasNextDouble()) {
                inputData[i] = scanner.nextDouble();
            } else {
                System.out.println("Wrong input! We need a number!");
                System.exit(0);
            }
        }

        /* Print the result */
        System.out.println(overTime(inputData));
    }

    public static String overTime(double[] arr) {
        double sum = 0;

        if (arr[1] > 17) {
            sum += (arr[1] - 17) * (arr[2] * arr[3]);
            sum += (17 - arr[0]) * arr[2];
        } else {
            sum += (arr[1] - arr[0]) * arr[2];
        }

        return String.format("$%.2f", sum);
    }
}
