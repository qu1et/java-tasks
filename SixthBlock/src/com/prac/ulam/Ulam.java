package com.prac.ulam;

import java.util.*;

public class Ulam {
    static int MAX = 20000;
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
        Set<Integer> s = new HashSet<Integer>();
        arr.add(1);
        s.add(1);

        arr.add(2);
        s.add(2);

        for (int i = 3; i < MAX; i++) {
            int count = 0;

            for (Integer integer : arr) {
                if (s.contains(i - integer) && integer != (i - integer)) {
                    count++;
                }

                if (count > 2) {
                    break;
                }
            }

            if (count == 2) {
                arr.add(i);
                s.add(i);
            }
        }
    }
}
