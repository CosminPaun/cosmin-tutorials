package com.paun.DateTimeApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by cpaun on 16.10.14.
 */
public class CalendarTest {
    public static void main(String args[]) {
        Calendar cal1 = new GregorianCalendar(2008, 1, 1);
        cal1.set( Calendar.MONTH, Calendar.MAY);
        System.out.println("Year: " + cal1.get(Calendar.YEAR));
        System.out.println("Month:  " + (cal1.get(Calendar.MONTH) + 1));
        System.out.println("Days: " + cal1.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        System.out.println(dateFormat.format(cal1.getTime()));
    }
}
