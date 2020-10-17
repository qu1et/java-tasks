package com.prac.getdecimalplaces;

import java.util.Arrays;
import java.util.Scanner;

public class GetDecimalPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a number */
        System.out.println("Enter a number: ");
        String num = scanner.nextLine();

        /* Print the result */
        System.out.println(getDecimalPlaces(num));
    }

    /* Count quantity of numbers after dot */
    public static int getDecimalPlaces(String num) {
        String[] splitter = num.split("\\.|,");
        return (splitter.length == 2) ? splitter[1].length() : 0;
    }
}
