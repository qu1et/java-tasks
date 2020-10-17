package com.prac.validatecard;

import java.util.*;

public class ValidateCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read card number */
        System.out.println("Enter card number");
        long cardNum = scanner.nextLong();

        /* Print the result */
        System.out.println(validateCard(cardNum));
    }

    public static boolean validateCard(long cardNum) {
        /* step 1 */
        long num = cardNum / 10;

        /* step 2 */
        num = reverseNumber(num);

        /* step 3 and 4 */
        int sum = doubleAndSumNumbers(num);

        /* step 5 */
        return (cardNum % 10 == sum % 10);
    }

    public static long reverseNumber(long num) {
        long buff = 0;

        while (num != 0) {
            buff = buff * 10 + num % 10;
            num /= 10;
        }

        return buff;
    }

    public static int doubleAndSumNumbers(long num) {
        int sum = 0;
        String str = Long.toString(num);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));

            if (i % 2 == 0) {
                digit *= 2;

                if (digit > 9) {
                    sum += digit / 10 + digit % 10;
                } else {
                    sum += digit;
                }

            } else {
                sum += digit;
            }
        }

        return sum;
    }
}
