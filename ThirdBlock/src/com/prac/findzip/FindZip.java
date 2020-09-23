package com.prac.findzip;

import java.util.Scanner;

public class FindZip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string: ");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(findZip(inputStr));
    }

    /* Find the second entrance of zip in a string */
    public static int findZip(String str) {
        String subStr = "zip";

        return str.indexOf(subStr, str.indexOf(subStr) + 1);
    }
}
