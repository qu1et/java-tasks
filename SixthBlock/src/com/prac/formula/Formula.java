package com.prac.formula;

import java.util.*;

public class Formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a formula */
        System.out.println("Enter a formula");
        String formula = scanner.nextLine();

        /* Print the result */
        System.out.println(checkFormula(formula));
    }

    public static boolean checkFormula(String formula) {
        if (!formula.contains("=")) {
            return false;
        }

        if (formula.contains("=")
                && formula.indexOf("=", formula.indexOf("=") + 1) == -1) {
            double res = Double.parseDouble(formula.substring(formula.indexOf("=") + 2));
            String[] arr = formula.substring(0, formula.indexOf("=")).split(" ");

            double buff = count(arr);

            return res == buff;
        }

        if (formula.contains("=")
                && formula.indexOf("=", formula.indexOf("=") + 1) != -1) {
            double res = Double.parseDouble(formula.substring(formula.indexOf("=") + 2,
                    formula.indexOf("=", formula.indexOf("=") + 1) - 1));
            String[] arr1 = formula.substring(0, formula.indexOf("=")).split(" ");
            String[] arr2 = formula.substring(formula.indexOf("=", formula.indexOf("=") + 1) + 2)
                    .split(" ");
            double buff1 = 0;
            double buff2 = 0;

            buff1 = count(arr1);
            buff2 = count(arr2);

            return buff1 == res && buff2 == res;

        }

        return false;
    }

    public static double count(String[] arr) {
        double buff = 0;

        try {
            buff = Double.parseDouble(arr[0]);
        } catch (Exception e) {
            return Double.parseDouble(null);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            switch (arr[i]) {
                case "+":
                    try {
                        buff += Double.parseDouble(arr[i + 1]);
                    } catch (Exception e) {
                        return Double.parseDouble(null);
                    }
                    break;
                case "-":
                    try {
                        buff -= Double.parseDouble(arr[i + 1]);
                    } catch (Exception e) {
                        return Double.parseDouble(null);
                    }
                    break;
                case "*":
                    try {
                        buff *= Double.parseDouble(arr[i + 1]);
                    } catch (Exception e) {
                        return Double.parseDouble(null);
                    }
                    break;
                case "/":
                    try {
                        buff /= Double.parseDouble(arr[i + 1]);
                    } catch (Exception e) {
                        return Double.parseDouble(null);
                    }
                    break;
                case "%":
                    try {
                        buff %= Double.parseDouble(arr[i + 1]);
                    } catch (Exception e) {
                        return Double.parseDouble(null);
                    }
                    break;
                default:
                    return Double.parseDouble(null);
            }
        }

        return buff;
    }
}
