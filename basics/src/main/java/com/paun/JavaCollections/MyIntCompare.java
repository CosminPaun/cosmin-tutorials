package com.paun.JavaCollections;

import java.util.Comparator;

/**
 * Created by cpaun on 15.10.14.
 */
public class MyIntCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
    }

}


