package com.prac.savevowelgroup;

import java.util.*;

public class SaveVowelGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read words */
        System.out.println("Enter words");
        String str = scanner.nextLine();

        /* Print the result */
        System.out.println(Arrays.toString(saveVowelGroup(str.split(" "))));
    }

    public static String[] saveVowelGroup(String[] arr) {
        HashSet<String> set = new HashSet<String>();
        set.add(arr[0]);
        String vowels = arr[0].replaceAll("[^aeoui]", "");
        vowels = "[" + vowels + "]";
        String pattern = "aeoui".replaceAll(vowels, "");
        boolean flag = false;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (pattern.indexOf(arr[i].charAt(j)) != -1) {
                    flag = true;
                }
            }

            if (!flag) {
                set.add(arr[i]);
            }

            flag = false;
        }

        return set.toArray(new String[0]);
    }
}
