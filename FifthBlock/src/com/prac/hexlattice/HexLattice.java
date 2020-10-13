package com.prac.hexlattice;

import java.util.*;

public class HexLattice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read number */
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        /* Print the result */
        System.out.println(hexLattice(num));
    }

    public static String hexLattice(int num) {
        if (num == 1) {
            return " * ";
        } else if (num < 0) {
            return "Invalid";
        }

        double n = (3 + Math.sqrt(12 * num - 3)) / 6;

        if (n - (int)n != 0) {
            return "Invalid";
        }

        int i = (int)n;
        StringBuilder upperPart = new StringBuilder();
        int k = i - 1;

        for(int up = 0; up < i; up++)
        {
            upperPart.append(" ".repeat(i - up));
            upperPart.append("* ".repeat(k + 1));
            upperPart.append(" ".repeat(i - up - 1));
            k++;
            upperPart.append("/n");
        }

        StringBuilder strBuffer = new StringBuilder(upperPart.toString());
        String bottomPart = strBuffer.reverse().toString();
        bottomPart = bottomPart.substring(bottomPart.indexOf(("n/"), 2) + 2);
        bottomPart = bottomPart.replaceAll("n/", "\n");

        return upperPart.toString().replaceAll("/n", "\n") + bottomPart;
    }
}
