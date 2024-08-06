package com.example.date;

/*

    How to manage date in Java?

    1. java.util.Date

 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {

        // way-1 : java.util.Date

        Date date = new Date();
        System.out.println(date);

        // Date to String
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatter.format(date));

        // String to Date
        String strDate = "01/01/2021 12:00:00";

        try {
            Date date2 = formatter.parse(strDate);
            System.out.println(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // java.util.Calendar

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));


        // java.time.* ( java 8 )

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        // Date to String
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(localDateTime.format(formatter1));

        // String to Date
        String strDate1 = "01/01/2021 12:00:00";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(strDate1, formatter2);

    }
}
