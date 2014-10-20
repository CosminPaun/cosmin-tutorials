package com.paun.JavaCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cpaun on 15.10.14.
 */
public class MapTester {

    public static void main (String args[]) {
        Map<String, String> map = new HashMap();

        fillData(map);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        map.put("Added lately", "testing");

        map.remove("Intellij");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }

    private static void fillData ( Map<String, String> map) {
        map.put("Android", "Module");
        map.put("Intellij", "Java");
        map.put("Cosmin", "QA");
    }
}
