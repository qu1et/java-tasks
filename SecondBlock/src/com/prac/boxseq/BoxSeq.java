package com.prac.boxseq;

import java.util.Scanner;

public class BoxSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0;

        /* Read a number */
        System.out.println("Enter a number of the step: ");
        if (scanner.hasNextInt()) {
            step = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need a number!");
            System.exit(0);
        }

        /* Print the result */
        System.out.println(countBoxSeq(step));
    }

    /* Count quantity of boxes */
    public static int countBoxSeq(int st) {
        int result = 0;

        if (st == 0) {
            return 0;
        }

        for (int i = 0; i < st; i++) {
            if (i % 2 == 0) {
                result += 3;
            } else {
                result--;
            }
        }

        return result;
    }
}
