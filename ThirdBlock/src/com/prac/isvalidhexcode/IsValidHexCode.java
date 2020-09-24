package com.prac.isvalidhexcode;

import java.util.Scanner;
import java.util.regex.*;

public class IsValidHexCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a Hex Code */
        System.out.println("Enter a hex code:");
        String inputStr = scanner.nextLine();

        /* Print the result */
        System.out.println(isValidHexCode(inputStr));
    }

    /* Check is a hex code valid */
    public static boolean isValidHexCode(String str) {
        // Create a pattern object
        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");

        // Create a matcher object
        Matcher matcher = pattern.matcher(str);

        if (str.charAt(0) != '#') {
            return false;
        } else if (str.length() != 7) {
            return false;
        } else {
            return matcher.matches();
        }
    }
}
