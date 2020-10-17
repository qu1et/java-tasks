package com.prac.tostarshorthand;

import java.util.Scanner;

public class ToStarShorthand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string:");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(toStarShorthand(inputStr));
    }

    public static String toStarShorthand(String str) {
        String res = "";
        int counter = 1;

        if (str.length() == 0) {
            return "";
        }

        res += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) && i != str.length() - 1) {
                counter++;
            } else if (str.charAt(i) != str.charAt(i - 1) && counter != 1) {
                res += "*" + counter + str.charAt(i);
                counter = 1;
            } else if (str.charAt(i) == str.charAt(i - 1) && i == str.length() - 1) {
                res += "*" + ++counter;
            } else {
                res += str.charAt(i);
            }
        }

        return res;
    }
}
