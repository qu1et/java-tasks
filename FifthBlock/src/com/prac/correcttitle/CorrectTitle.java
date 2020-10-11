package com.prac.correcttitle;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class CorrectTitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        /* Print the result */
        System.out.println(correctTitle(input));
    }

    public static String correctTitle(String str) {
        StringBuilder res = new StringBuilder();
        String[] arr = str.toLowerCase().split(" ");
        List<String> list = Arrays.asList("and", "the", "of", "in");

        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                res.append(arr[i]);
            } else if (arr[i].contains("-")) {
                res.append(Character.toString(arr[i].charAt(0)).toUpperCase())
                        .append(arr[i].substring(1, arr[i].indexOf("-") + 1))
                        .append(Character.toString(arr[i].charAt(arr[i].indexOf("-") + 1)).toUpperCase())
                        .append(arr[i].substring(arr[i].indexOf("-") + 2));
            } else {
                res.append(Character.toString(arr[i].charAt(0)).toUpperCase())
                        .append(arr[i].substring(1));
            }

            if (i != arr.length - 1) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}
