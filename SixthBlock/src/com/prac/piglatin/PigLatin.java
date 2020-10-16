package com.prac.piglatin;

import java.util.Scanner;
import java.util.regex.*;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        /* Print the result */
        if (input.contains(" ")) {
            System.out.println(pigLatinSentence(input));
        } else {
            System.out.println(pigLatin(input));
        }
    }

    public static String pigLatin(String str) {
        if (str.length() == 0) {
            return "";
        }

        if ("aeouiAEOUI".indexOf(str.charAt(0)) != -1) {
            return str + "yay";
        }

        for (int i = 0; i < str.length(); i++) {
            if ("aeouiAEOUI".indexOf(str.charAt(i)) != -1 &&
                ";!?,.-_".indexOf(str.charAt(str.length() - 1)) != -1) {
                return str.substring(i, str.length() - 1) + str.substring(0, i)
                        + "ay" + str.substring(str.length() - 1);
            } else if ("aeouiAEOUI".indexOf(str.charAt(i)) != -1) {
                return str.substring(i) + str.substring(0, i) + "ay";
            }
        }

        return str;
    }

    public static String pigLatinSentence(String str) {
        String[] arr = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word: arr) {
            res.append(pigLatin(word));
            res.append(" ");
        }

        return res.toString();
    }
}
