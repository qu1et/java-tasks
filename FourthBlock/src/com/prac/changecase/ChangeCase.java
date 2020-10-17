package com.prac.changecase;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string");
        String inputStr = scanner.nextLine();

        /* Print the result */
        if (inputStr.indexOf('_') != -1) {
            System.out.println(toCamelCase(inputStr));
            System.exit(0);
        }

        System.out.println(toSnakeCase(inputStr));
    }

    public static String toCamelCase(String str) {
        String[] arr = str.toLowerCase().split("_");
        String res = "";

        res += arr[0];

        for (int i = 1; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }

        return res;
    }

    public static String toSnakeCase(String str) {
        String res = "";
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                res += str.substring(start, i) + '_';
                start = i;
            }

            if (i == str.length() - 1 && start != 0) {
                res += str.substring(start);
            }

            if (i == str.length() - 1 && start == 0) {
                res += str;
            }
        }

        return res.toLowerCase();
    }
}
