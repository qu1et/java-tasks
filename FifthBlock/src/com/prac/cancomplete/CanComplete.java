package com.prac.cancomplete;

import java.util.Scanner;

public class CanComplete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read the substring */
        System.out.println("Enter the substring");
        String subStr = scanner.nextLine();

        /* Read the string */
        System.out.println("Enter the string");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(canComplete(subStr, inputStr));
    }

    public static boolean canComplete(String substr, String str) {
        int prev = 0;

        for (int i = 1; i < substr.length(); i++) {
            int val = str.indexOf(substr.charAt(i), i + 1);
            if (val == -1 || val < prev) {
                return false;
            }
            prev = val;
        }

        return true;
    }
}
