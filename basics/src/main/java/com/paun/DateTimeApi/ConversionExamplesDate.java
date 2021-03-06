package com.paun.DateTimeApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by cpaun on 16.10.14.
 */
public class ConversionExamplesDate {

    private void stringToDate() {
        try {
            Date date1;
            date1 = new SimpleDateFormat("MM/dd/yy").parse("05/18/05");
            System.out.println(date1);
            Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse("05/18/2007");
            System.out.println(date2);
        } catch (ParseException e ) {
            e.printStackTrace();
        }
    }

    private void calcDate( long milisecs) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        Date resultdate = new Date(milisecs);
        System.out.println(dateFormat.format(resultdate));

    }

    private void writeActualDate() {
        Calendar cal = new GregorianCalendar();
        Date creationDate = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy HH:mm");
        System.out.println(dateFormat.format(creationDate));
    }

    public static void main(String[] args){
        ConversionExamplesDate convert = new ConversionExamplesDate();
        convert.stringToDate();
        convert.calcDate(System.currentTimeMillis());
        convert.writeActualDate();
    }
}
