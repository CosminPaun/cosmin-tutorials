package com.paun.JavaIO;

/**
 * Created by cpaun on 15.10.14.
 */
public class testMyFile {
    public static void main(String[] args) {
        MyFile myFile = new MyFile();
        String input = myFile.readTextFile("Test.txt");
        System.out.println(input);
        myFile.writeTextFile("Testing2.txt", input);

    }
}
