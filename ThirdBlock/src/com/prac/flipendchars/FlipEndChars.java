package com.prac.flipendchars;

import java.util.Scanner;

public class FlipEndChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string:");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(flipEndChars(inputStr));
    }

    public static String flipEndChars(String str) {
        if (str.length() < 2) {
            return "Incompatible";
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return "Two's a pair";
        } else {
            return str.charAt(str.length() - 1) +
                    str.substring(1, str.length() - 1) +
                    str.charAt(0);
        }
    }
}
