package com.prac.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a number */
        System.out.println("Enter a number");
        String num = scanner.nextLine();

        /* Print the result */
        System.out.println(isPalDes(num));
    }

    public static boolean isPalDes(String str) {
        if (str.length() <= 1) {
            return false;
        } else if (str.length() == 2 && !isPalindrome(str)) {
            return false;
        }

        if (isPalindrome(str)) {
            return true;
        }

        while (str.length() >= 2) {
            StringBuilder sub = new StringBuilder();

            for (int i = 0; i < str.length() - 1; i += 2) {
                if (i == str.length() - 1) {
                    sub.append(str.charAt(i));
                }

                int sum = Character.getNumericValue(str.charAt(i)) +
                        Character.getNumericValue(str.charAt(i + 1));

                sub.append(sum);
            }

            if (str.length() % 2 != 0) {
                sub.append(str.charAt(str.length() - 1));
            }

            if (isPalindrome(sub.toString())) {
                return true;
            }

            str = sub.toString();
        }

        return false;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
