package com.paun.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by cpaun on 16.10.14.
 */

@XmlRootElement(namespace="com.paun.JAXB")
public class Bookstore {

    private ArrayList<Book> bookList;
    private String name;
    private String location;

    @XmlElementWrapper(name="bookList")
    @XmlElement(name="book")
    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
