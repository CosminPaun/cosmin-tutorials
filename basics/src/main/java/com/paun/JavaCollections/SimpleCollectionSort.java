package com.paun.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cpaun on 15.10.14.
 */
public class SimpleCollectionSort {

    public static void main (String[] args) {
        List list = new ArrayList();

        list.add(5);
        list.add(3);
        list.add(19);
        list.add(15);

        Collections.sort(list);

        for (Object integ : list ) {

            System.out.println(integ);
        }
    }
}
