package com.prac.hashtag;

import java.util.*;

public class HashTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read string */
        System.out.println("Enter string");
        String input = scanner.nextLine();

        /* Print the result */
        System.out.println(Arrays.toString(getHashTag(input)));
    }

    public static String[] getHashTag(String str) {
        String[] arr = str.toLowerCase().split(" ");
        String[] res = new String[3];
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        sortArr(arr);

        int first = arr[arr.length - 1].replaceAll("\\W", "").length();
        int second = arr[arr.length - 2].replaceAll("\\W", "").length();
        int third = arr[arr.length - 3].replaceAll("\\W", "").length();

        System.out.println(Arrays.toString(arr));

        for (String s : arr) {
            if (s.replaceAll("\\W", "").length() == first) {
                str1.append(s.replaceAll("\\W", ""));
                str1.append(" ");
            } else if (s.replaceAll("\\W", "").length() == second) {
                str2.append(s.replaceAll("\\W", ""));
                str2.append(" ");
            } else if (s.replaceAll("\\W", "").length() == third) {
                str3.append(s.replaceAll("\\W", ""));
                str3.append(" ");
            }
        }

        if (first > second && second > third) {
            res[0] = "#" + str1.substring(0, str1.toString().indexOf(" "));
            res[1] = "#" + str2.substring(0, str2.toString().indexOf(" "));
            res[2] = "#" + str3.substring(0, str3.toString().indexOf(" "));
        } else if (first > second && second == third) {
            String[] buff = str2.toString().split(" ");
            res[0] = "#" + str1.substring(0, str1.toString().indexOf(" "));
            res[1] = "#" + buff[0];
            res[2] = "#" + buff[1];
        } else if (first == second && second == third) {
            String[] buff = str1.toString().split(" ");
            res[0] = "#" + buff[0];
            res[1] = "#" + buff[1];
            res[2] = "#" + buff[2];
        }

        return res;
    }

    public static void sortArr(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1].replaceAll("\\W", "").length() >
                        arr[j].replaceAll("\\W", "").length()) {
                    String tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }
}
