package com.prac.ctoa;

import java.util.Scanner;

public class CTOA {

    public Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character;

        /* Read single character */
        System.out.println("Enter a single character:");
        character = scanner.next().charAt(0);

        /* Print an ASCII transcription of a character */
        System.out.println(ctoa(character));
    }

    /* Get an ASCII transcription of a character */
    public static int ctoa(char c) {
        return (int) c;
    }
}
