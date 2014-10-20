package com.paun.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by cpaun on 16.10.14.
 */
public class BookMain {

    private static final String BOOKSTORE_XML = "bookstore-jaxb.xml";

    public static void main (String args[] ) throws JAXBException, FileNotFoundException {
        ArrayList<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setIsbn("978-0060554736");
        book1.setName("The Game");
        book1.setAuthor("Neil Strauss");
        book1.setPublisher("Harpercollins");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("978-3832180577");
        book2.setName("Feuchtgebiete");
        book2.setAuthor("Charlotte Roche");
        book2.setPublisher("Dumont Buchverlag");
        bookList.add(book2);

        //bookstore
        Bookstore bookstore = new Bookstore();
        bookstore.setName("Fraport Bookstore");
        bookstore.setLocation("Frankfurt Airport");
        bookstore.setBookList(bookList);

        JAXBContext context = JAXBContext.newInstance(Bookstore.class);

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal( bookstore, System.out);

        m.marshal(bookstore, new File(BOOKSTORE_XML));

        Unmarshaller um = context.createUnmarshaller();

        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));

        ArrayList<Book> list = bookstore2.getBookList();

        for (Book book :  list ) {
            System.out.println("Book: " + book.getName() + " from " + book.getAuthor());
        }
    }
}
