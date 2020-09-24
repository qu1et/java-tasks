package com.prac.longestzero;

import java.util.Scanner;

public class LongestZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a sequence of 0 and 1:");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(findLongestZero(inputStr));
    }

    /* Find the longest sequence of zero */
    public static String findLongestZero(String str) {
        String[] subStr;
        int max = 0;
        String maxString = "";
        subStr = str.split("1");

        for (String elem: subStr) {
            if (elem.length() > max) {
                max = elem.length();
                maxString = elem;
            }
        }

        return maxString;
    }
}
