package com.prac.numtostring;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read number */
        System.out.println("Enter a number");
        String inputStr = scanner.next();

        /* Print the result */
        System.out.println(numToEng(inputStr));
        System.out.println(numToRus(inputStr));
    }

    public static String numToEng(String num) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
        map.put("0", "zero");
        map.put("10", "ten");
        map.put("11", "eleven");
        map.put("12", "twelve");
        map.put("13", "thirteen");
        map.put("15", "fifteen");
        map.put("18", "eighteen");
        map.put("20", "twenty");
        map.put("30", "thirty");
        map.put("40", "forty");
        map.put("50", "fifty");
        map.put("60", "sixty");
        map.put("70", "seventy");
        map.put("80", "eighty");
        map.put("90", "ninety");

        String res = "";

        if (num.length() == 3) {
            res += map.get(Character.toString(num.charAt(0))) + " hundred";

            if (num.substring(1).equals("00")) {
                return res;
            }

            if (map.get(num.substring(1)) != null) {
                res += " " + map.get(num.substring(1));
                return res;
            }

            switch (Character.toString(num.charAt(1))) {
                case "1" -> res += " " + map.get(Character.toString(num.charAt(2))) + "teen";
                case "2" -> res += " " + "twenty " + map.get(Character.toString(num.charAt(2)));
                case "3" -> res += " " + "thirty " + map.get(Character.toString(num.charAt(2)));
                case "4" -> res += " " + "forty " + map.get(Character.toString(num.charAt(2)));
                case "5" -> res += " " + "fifty " + map.get(Character.toString(num.charAt(2)));
                case "8" -> res += " " + "eighty " + map.get(Character.toString(num.charAt(2)));
                case "0" -> res += " " + map.get(Character.toString(num.charAt(2)));
                default -> res += " " + map.get(Character.toString(num.charAt(1))) + "ty " +
                        map.get(Character.toString(num.charAt(2)));
            }
        } else if (num.length() == 2) {
            if (map.get(num) != null) {
                res += map.get(num);
                return res;
            }

            switch (map.get(Character.toString(num.charAt(0)))) {
                case "1" -> res += map.get(Character.toString(num.charAt(1))) + "teen";
                case "2" -> res += "twenty " + map.get(Character.toString(num.charAt(1)));
                case "3" -> res += "thirty " + map.get(Character.toString(num.charAt(1)));
                case "4" -> res += "forty " + map.get(Character.toString(num.charAt(1)));
                case "5" -> res += "fifty " + map.get(Character.toString(num.charAt(1)));
                case "8" -> res += "eighty " + map.get(Character.toString(num.charAt(1)));
                default -> res += map.get(Character.toString(num.charAt(0))) + "ty " +
                        map.get(Character.toString(num.charAt(1)));
            }
        } else if (num.length() == 1) {
            res += map.get(num);
        }

        return res;
    }

    public static String numToRus(String num) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "один");
        map.put("2", "два");
        map.put("3", "три");
        map.put("4", "четыре");
        map.put("5", "пять");
        map.put("6", "шесть");
        map.put("7", "семь");
        map.put("8", "восемь");
        map.put("9", "девять");
        map.put("0", "ноль");
        map.put("10", "десять");
        map.put("11", "одиннадцать");
        map.put("12", "двенадцать");
        map.put("13", "тринадцать");
        map.put("40", "сорок");
        map.put("90", "девяносто");

        String res = "";

        if (num.length() == 3) {
            if (map.get(num) != null) {
                return map.get(num);
            }

            switch (Character.toString(num.charAt(0))) {
                case "1" -> res += "сто";
                case "2" -> res += "двести";
                case "3", "4" -> res += map.get(Character.toString(num.charAt(0)) + "ста");
                default -> res += map.get(Character.toString(num.charAt(0))) + "сот";
            }

            if (map.get(num.substring(1)) != null) {
                res += " " + map.get(num.substring(1));
                return res;
            } else if (num.substring(1).equals("00")) {
                return res;
            } else if (num.charAt(2) == '0') {
                switch (Character.toString(num.charAt(1))) {
                    case "2", "3" -> res += " " + map.get(Character.toString(num.charAt(1))) + "дцать";
                    default -> res += " " + map.get(Character.toString(num.charAt(1))) + "десят";
                }
                return res;
            }

            switch (Character.toString(num.charAt(1))) {
                case "0" -> res += " " + map.get(Character.toString(num.charAt(2)));
                case "1" -> res += " " + map.get(Character.toString(num.charAt(2)))
                        .substring(0, map.get(Character.toString(num.charAt(2))).length() - 1) + "надцать";
                case "2", "3" -> res += " " + map.get(Character.toString(num.charAt(1))) + "дцать "
                        + map.get(Character.toString(num.charAt(2)));
                case "4" -> res += " сорок " + map.get(Character.toString(num.charAt(2)));
                case "9" -> res += " девяносто " + map.get(Character.toString(num.charAt(2)));
                default -> res += " " + map.get(Character.toString(num.charAt(1))) + "десят "
                        + map.get(Character.toString(num.charAt(2)));
            }
        } else if (num.length() == 2) {
            if (map.get(num) != null) {
                return map.get(num);
            } else if (num.charAt(1) == '0') {
                switch (Character.toString(num.charAt(0))) {
                    case "2", "3" -> res += map.get(Character.toString(num.charAt(0))) + "дцать";
                    default -> res += map.get(Character.toString(num.charAt(0))) + "десят";
                }
                return res;
            }

            switch (Character.toString(num.charAt(0))) {
                case "1" -> res += map.get(Character.toString(num.charAt(1)))
                        .substring(0, map.get(Character.toString(num.charAt(1))).length() - 1) + "надцать";
                case "2", "3" -> res += map.get(Character.toString(num.charAt(0))) + "дцать"
                        + map.get(Character.toString(num.charAt(1)));
                case "4" -> res += "сорок " + map.get(Character.toString(num.charAt(1)));
                case "9" -> res += "девяносто " + map.get(Character.toString(num.charAt(1)));
                default -> res += map.get(Character.toString(num.charAt(0))) + "десят"
                        + map.get(Character.toString(num.charAt(1)));
            }
        } else if (num.length() == 1) {
            res = map.get(num);
        }

        return res;
    }
}
