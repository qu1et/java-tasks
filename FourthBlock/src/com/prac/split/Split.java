package com.prac.split;

import java.util.*;

public class Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter sequence of brackets:");
        String inputStr = scanner.nextLine();

        /* Return the result */
        System.out.println(splitBrackets(inputStr));
    }

    public static String splitBrackets(String str) {
        String subStr = "";
        Stack<String> s = new Stack<String>();
        int bracketsCount = 0;

        if (str.charAt(0) == ')') {
            return "Wrong string!";
        }

        if (str.charAt(str.length() - 1) == '(') {
            return "Wrong string!";
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                subStr += str.charAt(i);
                bracketsCount++;
            } else if (str.charAt(i) == ')') {
                subStr += str.charAt(i);
                bracketsCount--;
            }

            if (bracketsCount == 0) {
                s.push(subStr);
                subStr = "";
            }

            if (bracketsCount != 0 && i == str.length() - 1) {
                return "Not balanced string";
            }
        }

        return Arrays.toString(s.toArray());
    }
}
