package com.paun.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cpaun on 15.10.14.
 */
public class TestCompare {

    public static void main (String args[]) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        Collections.sort(list, new MyIntCompare());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
