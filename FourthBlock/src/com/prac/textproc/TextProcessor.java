package com.prac.textproc;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, k = 0;

        /* Read word count */
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        /* Read string length */
        if (scanner.hasNextInt()) {
            k = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        scanner.nextLine();

        /* Read essay */
        String essay = scanner.nextLine();

        /* Print the result */
        System.out.println(fixEssay(n, k, essay));
    }

    public static String fixEssay(int n, int k, String str) {
        /* Split string to array */
        String[] arr = str.split(" ");
        int occPlace = 0;
        String res = "";

        res += arr[0];
        occPlace += arr[0].length();

        for (int i = 1; i < n; i++) {
            if (arr[i].length() + occPlace <= k) {
                res += " " + arr[i];
                occPlace += arr[i].length();
            } else {
                res += "\n" + arr[i];
                occPlace = arr[i].length();
            }
        }

        return res;
    }
}
