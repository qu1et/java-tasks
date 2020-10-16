package com.prac.validcolor;

import java.util.Scanner;

public class ValidColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Enter a color property */
        System.out.println("Enter color property");
        String rgbColor = scanner.nextLine();

        /* Print the result */
        System.out.println(validColor(rgbColor));
    }

    public static boolean validColor(String rgb) {
        String props = rgb.substring(rgb.indexOf("(") + 1,
                                    rgb.indexOf(")"));

        String[] arr = props.split(",");

        if (rgb.contains("rgba") && arr.length != 4) {
            return false;
        } else if (rgb.contains("rgba") && arr.length == 4) {
            try {
                if (Double.parseDouble(arr[3]) > 1 || Double.parseDouble(arr[3]) < 0) {
                    return false;
                }

                for (int i = 0; i < arr.length - 1; i++) {
                    if (Integer.parseInt(arr[i]) > 255 || Integer.parseInt(arr[i]) < 0) {
                        return false;
                    }
                }
            } catch (NumberFormatException e) {
                return false;
            }

            return true;
        }

        if (rgb.contains("rgb") && arr.length != 3) {
            return false;
        } else if (rgb.contains("rgb") && arr.length == 3) {
            try {
                for (String el: arr) {
                    if (Integer.parseInt(el) > 255 || Integer.parseInt(el) < 0) {
                        return false;
                    }
                }
            } catch (NumberFormatException e) {
                return false;
            }

            return true;
        }

        return false;
    }
}
