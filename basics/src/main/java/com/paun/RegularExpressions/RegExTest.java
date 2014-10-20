package com.paun.RegularExpressions;

/**
 * Created by cpaun on 15.10.14.
 */
public class RegExTest {

    public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";

    public static void main (String argss[]) {
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));

        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);

        for (String string: splitString) {
            System.out.println(string);
        }

        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}
