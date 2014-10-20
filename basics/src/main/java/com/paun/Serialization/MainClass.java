package com.paun.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by cpaun on 16.10.14.
 */
public class MainClass {

    public static void main ( String args[]) {
        String filename = "time.ser";

        Person p = new Person("Cosmin", "Paun");

        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(p);

            out.close();
        } catch (Exception e ) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            p = (Person) in.readObject();
            in.close();
        } catch (Exception e ) {
            e.printStackTrace();
        }

        System.out.println(p);
    }
}
