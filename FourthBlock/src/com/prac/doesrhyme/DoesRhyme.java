package com.prac.doesrhyme;

import java.util.Scanner;
import java.util.Arrays;

public class DoesRhyme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read the first line */
        System.out.println("Enter the first line:");
        String fstString = scanner.nextLine();

        /* Read the second line */
        System.out.println("Enter the second line");
        String scndString = scanner.nextLine();

        /* Print the result */
        System.out.println(checkRhyme(fstString, scndString));
    }

    /* Check is the lines rhyme */
    public static boolean checkRhyme(String str1, String str2) {
        String[] word1 = str1.split(" ");
        String[] word2 = str2.split(" ");

        String w1 = sortString(word1[word1.length - 1].toLowerCase());
        String w2 = sortString(word2[word2.length - 1].toLowerCase());

        System.out.println(w1.replaceAll("[^aeiou]", ""));
        System.out.println(w2.replaceAll("[^aeiou]", ""));

        return (w1.replaceAll("[^aeiou]", "")
                .equalsIgnoreCase(w2.replaceAll("[^aeiou]", "")));
    }

    /* Sort characters in string */
    public static String sortString(String str) {
        char[] charStr = str.toCharArray();

        Arrays.sort(charStr);

        return String.valueOf(charStr);
    }
}
