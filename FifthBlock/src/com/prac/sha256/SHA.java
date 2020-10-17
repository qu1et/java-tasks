package com.prac.sha256;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.math.BigInteger;
import java.security.*;

public class SHA {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        /* Read password */
        System.out.println("Enter password");
        String password = scanner.nextLine();

        /* Print SHA256 code */
        System.out.println(getSHA256Code(password));
    }

    public static String getSHA256Code(String str) throws NoSuchAlgorithmException {
        StringBuilder hexString = new StringBuilder();
        byte[] hash = getHash(str);

        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public static byte[] getHash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
}
