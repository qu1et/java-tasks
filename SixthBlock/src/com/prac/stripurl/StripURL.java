package com.prac.stripurl;

import java.util.*;

public class StripURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Read an URL */
        System.out.println("Enter an URL");
        String url = scanner.nextLine();

        /* Read parameters */
        System.out.println("Enter parameters(optional)");
        String params = scanner.nextLine();

        HashSet<String> set = new HashSet<String>(Arrays.asList(params.split("")));

        /* Print the result */
        System.out.println(stripUrlParams(url, set.toString()));
    }

    public static String stripUrlParams(String url, String params) {
        if (!url.contains("?")) {
            return url;
        }

        String finalUrl = url.substring(0, url.indexOf("?") + 1);
        String buff = url.substring(url.indexOf("?") + 1);
        String[] args = buff.split("&");
        StringBuilder exist = new StringBuilder();
        StringBuilder newArgs = new StringBuilder();
        StringBuilder fixedParams = new StringBuilder();

        for (int i = args.length - 1; i >= 0; i--) {
            if (exist.toString().indexOf(args[i].charAt(0)) == -1) {
                if (params.indexOf(args[i].charAt(0)) == -1) {
                    newArgs.append(args[i]);
                    exist.append(args[i].charAt(0));
                }
            }
        }

        for (int i = 0; i < args.length - 1; i++) {
            if (newArgs.toString().contains(args[i].substring(0, 2)) &&
                !fixedParams.toString().contains(args[i].substring(0, 2))) {
                    fixedParams.append(newArgs.substring(newArgs.indexOf(String.valueOf(args[i].charAt(0))),
                            newArgs.indexOf(String.valueOf(args[i].charAt(0))) + 3));

                fixedParams.append("&");
            }
        }

        return finalUrl + fixedParams.substring(0, fixedParams.length() - 1);
    }
}
