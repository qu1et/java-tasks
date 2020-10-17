package com.prac.isprefixsuffix;

import java.util.Scanner;

public class IsPrefixSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read the string */
        System.out.println("Enter the first string: ");
        String word = scanner.nextLine();

        /* Read the substring */
        System.out.println("Enter the second string: ");
        String substring = scanner.nextLine();

        /* Return the result */
        if (substring == "") {
            System.out.println("Enter a substring!");
        } else if (substring.charAt(0) == '-') {
            System.out.format("isSuffix: %b", isSuffix(word, substring));
            System.exit(0);
        } else if (substring.charAt(substring.length() - 1) == '-') {
            System.out.format("isPrefix: %b", isPrefix(word, substring));
            System.exit(0);
        }
    }

    /* Check is it prefix */
    public static boolean isPrefix(String str, String substr) {
        String sub = substr.replace("-", "");

        return str.startsWith(sub);
    }

    public static boolean isSuffix(String str, String substr) {
        String sub = substr.replace("-", "");

        return str.endsWith(sub);
    }
}
