package com.prac.isstrangepair;

import java.util.Scanner;

public class IsStrangePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read string pair */
        System.out.println("Enter the first string: ");
        String firstStr = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondStr = scanner.nextLine();

        /* Print the result */
        System.out.println(isStrangePair(firstStr, secondStr));
    }

    /* Check is the pair strange */
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.length() == 0 && str2.length() == 0) {
            return true;
        }

        if (str1.charAt(0) == str2.charAt(str2.length() - 1) &&
            str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            return true;
        }

        return false;
    }
}
