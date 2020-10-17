package com.prac.bmi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read a weight */
        System.out.println("Enter your weight (use . on non-integer values)");
        String weight = scanner.nextLine();

        /* Read a height */
        System.out.println("Enter your height (use . on non-integer values)");
        String height = scanner.nextLine();

        /* Print the result */
        System.out.println(getBMI(weight, height));
    }

    /* Compute the BMI */
    public static String getBMI(String w, String h) {
        double weight = Double.parseDouble(w.substring(0, w.indexOf(" "))),
                height = Double.parseDouble(h.substring(0, h.indexOf(" ")));
        String res = "";

        if (w.contains("pounds")) {
            weight *= 0.454;
        }

        if (h.contains("inches")) {
            height /= 39.370;
        }

        if (weight < 0 || height < 0) {
            return "Wrong input!";
        }

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            res =  String.format("%.1f Underweight", bmi);
        } else if (bmi > 18.5 && bmi < 24.9) {
            res = String.format("%.1f Normal weight", bmi);
        } else if (bmi > 25) {
            res = String.format("%.1f Overweight", bmi);
        }

        return res;
    }
}
