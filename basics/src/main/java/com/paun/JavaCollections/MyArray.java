package com.paun.JavaCollections;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by cpaun on 15.10.14.
 */
public class MyArray {
    public static void main (String []args ) {
        List<String> var = new ArrayList();

        var.add("Cosmin");
        var.add("Paun");


        for (String s : var ) {
            System.out.println(s);
        }
    }
}
