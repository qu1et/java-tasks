package com.prac.same;

import java.util.HashSet;
import java.util.*;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = 0, size2 = 0;

        /* Create a sets */
        HashSet<Double> set1 = new HashSet<Double>();
        HashSet<Double> set2 = new HashSet<Double>();

        /* Read a size of the first numbers set */
        System.out.println("Enter size of the first set of numbers:");
        if (scanner.hasNextInt()) {
            size1 = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }


        /* Read the first numbers set */
        System.out.println("Enter the first set of elements:");
        for (int i = 0; i < size1; i++) {
            if (scanner.hasNextDouble()) {
                set1.add(scanner.nextDouble());
            } else {
                System.out.println("Wrong input! We need a number!");
                System.exit(0);
            }
        }

        /* Read a size of the second numbers set */
        System.out.println("Enter size of the second set of numbers:");
        if (scanner.hasNextInt()) {
            size2 = scanner.nextInt();
        } else {
            System.out.println("Wrong input! We need an integer number!");
            System.exit(0);
        }

        /* Read the second numbers set */
        System.out.println("Enter the second set of elements:");
        for (int i = 0; i < size2; i++) {
            if (scanner.hasNextDouble()) {
                set2.add(scanner.nextDouble());
            } else {
                System.out.println("Wrong input! We need a number!");
                System.exit(0);
            }
        }

        /* Print the result */
        System.out.println(isSame(set1, set2));
    }

    /* Compare sizes of two sets */
    public static boolean isSame(HashSet<Double> set1, HashSet<Double> set2) {
        return set1.size() == set2.size();
    }
}
