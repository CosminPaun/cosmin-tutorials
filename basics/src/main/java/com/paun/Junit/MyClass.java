package com.paun.Junit;

/**
 * Created by cpaun on 16.10.14.
 */
public class MyClass {
    public int multiply (int x, int y ) {
        if (x > 999 ) {
            throw new IllegalArgumentException("X should be less than 1000");
        }

        return x * y;
    }
}
