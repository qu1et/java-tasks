package com.prac.isvalid;

import java.util.Scanner;

public class IsValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read the string */
        System.out.println("Enter an index: ");
        String index = scanner.nextLine();

        /* Return result */
        System.out.println(isValid(index));
    }

    /* Check is an index valid */
    public static boolean isValid(String str) {
        int spaces = str.length() - str.replaceAll(" ", "").length();

        if (str.length() != 5 || spaces != 0 || !str.matches("\\d+")) {
            return false;
        }

        return true;
    }
}
