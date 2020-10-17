package com.prac.crypt;

import java.util.Scanner;
import java.util.Arrays;

public class Crypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";

        System.out.println("0 - encrypt, 1 - decrypt");
        operation = scanner.nextLine();

        if (operation.equals("0")) {
            System.out.println("Enter a string");
            String inputStr = scanner.nextLine();

            System.out.println(Arrays.toString(encrytp(inputStr)));
            System.exit(0);
        }

        System.out.println("Enter array size");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(decrypt(arr));
    }

    public static int[] encrytp(String str) {
        int[] res = new int[str.length()];
        res[0] = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            res[i] = str.charAt(i) - str.charAt(i - 1);
        }

        return res;
    }

    public static StringBuilder decrypt(int[] arr) {
        StringBuilder res = new StringBuilder();
        int currChar = 0;

        for (int el: arr) {
            currChar += el;
            res.append((char) currChar);
        }

        return res;
    }
}
