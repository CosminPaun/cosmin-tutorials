package com.paun.JavaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cpaun on 15.10.14.
 */
public class ConvertMapTester {

    public static void main (String args[]) {
        Map<String, String> map = new HashMap();

        fillData(map);

        String[] strings = keysAsArray(map);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("");
        List<String> list = keysAsList(map);
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void fillData(Map<String, String> map ) {
        map.put("Android", "Module");
        map.put("Intellij", "Java");
        map.put("Cosmin", "QA");
    }

    private static String[] keysAsArray(Map<String, String> map) {
        return map.keySet().toArray(new String[map.keySet().size()]);
    }

    private static List<String> keysAsList (Map<String, String> map ) {
        List<String> list = new ArrayList<String>(map.keySet());

        return list;
    }
}
