package com.prac.nonrepeat;

import java.util.*;

public class NonRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a string */
        System.out.println("Enter string");
        String input = scanner.nextLine();

        /* Print the result */
        System.out.println(getNonRepeatSubstring(input));
    }

    public static String getNonRepeatSubstring(String str) {
        Map<Character, Integer> visited = new HashMap<>();
        String res = "";

        for (int start = 0, end = 0; end < str.length(); end++) {
            char currChar = str.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }

            if (res.length() < end - start + 1) {
                res = str.substring(start, end + 1);
            }

            visited.put(currChar, end);
        }

        return res;
    }
}
