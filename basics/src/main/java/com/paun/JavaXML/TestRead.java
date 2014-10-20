package com.paun.JavaXML;

import java.util.List;

/**
 * Created by cpaun on 16.10.14.
 */
public class TestRead {
    public static void main( String[] args) {
        StaxParser read = new StaxParser();
        List<Item> readConfig = read.readConfig("config.xml");
        for (Item item: readConfig) {
            System.out.println(item);
        }
    }
}
