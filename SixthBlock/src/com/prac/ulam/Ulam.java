package com.prac.ulam;

import java.util.*;

public class Ulam {
    static int MAX = 2000;
    static Vector<Integer> arr = new Vector<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a number */
        System.out.println("Enter number");
        int num = scanner.nextInt();

        ulam();

        /* Print the result */
        System.out.println(arr.get(num - 1));
    }

    public static void ulam() {
        arr.add(1);
        arr.add(2);

        for (int i = 3; i < MAX; i++) {
            int count = 0;

            for (int j = 0; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(j) + arr.get(k) == i) {
                        count++;
                    }

                    if (count > 1) {
                        break;
                    }
                }
                if (count > 1) {
                    break;
                }
            }

            if (count == 1) {
                arr.add(i);
            }
        }
    }
}
