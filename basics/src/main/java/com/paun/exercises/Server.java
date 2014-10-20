package com.paun.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpaun on 15.10.14.
 */
public class Server {

    private String url;

    public Server (String url ) {
        this.url = url;
    }

    public String getUrl() {
       return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static void main (String[] args) {
        List<Server> list = new ArrayList<Server>();

        list.add(new Server("http://intranet.smava.de"));
        list.add(new Server("http://testing2.smava.de"));
        list.add(new Server("http://testing3.smava.de"));
        list.add(new Server("http://testing4.smava.de"));
        list.add(new Server("http://testing5.smava.de"));

        for (Server servList : list) {
            System.out.println(servList.getUrl());
        }
    }
}

