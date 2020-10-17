package com.prac.repeat;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        /* Read string */
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        /* Read quantity of repeats */
        System.out.println("Enter quantity of character repeats: ");
        if (scanner.hasNextInt()) {
                count = scanner.nextInt();
        } else {
            System.out.println("This is not a number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(repeatTheString(str, count));
    }

    public static String repeatTheString(String inputString, int count) {
        String newString = "";

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = 0; j < count; j++) {
                newString += inputString.charAt(i);
            }
        }

        return newString;
    }
}
