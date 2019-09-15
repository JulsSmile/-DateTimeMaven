package com.tasks;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.DayOfWeek;

public class Date {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " +  currentDate);
        LocalDateTime currentTime = LocalDateTime.now();


        String date = String.valueOf(currentDate);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime formattedDate = dtf.parseDateTime(date);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        System.out.println("Formatted current date: " + dtfOut.print(formattedDate));
        DateTimeFormatter dateformatOut = DateTimeFormat.forPattern("dd-MM-yyyy");
        String currentDateFormatted = dateformatOut.print(formattedDate);
        System.out.println("Formatted current date: " + currentDateFormatted);

        System.out.println("Time in long at the start of day: " +  formattedDate.withTimeAtStartOfDay().getMillis());
        long longDate = formattedDate.millisOfDay().withMaximumValue().getMillis();
        System.out.println("Time in long at the end of day: " +  longDate);

        DateTimeFormatter convertLongToStr = DateTimeFormat.forPattern("yyyy-MM-dd.HH.mm.ss.SS");
        System.out.println("Formatted current date and time: " +convertLongToStr.print(longDate));

        LocalDate dateForCompare = new LocalDate(968498900000L);
        String dateInFutureFormatted = dateformatOut.print(dateForCompare);
        boolean isBefore = currentDate.isBefore(dateForCompare);
        System.out.println(currentDateFormatted + " is before " + dateInFutureFormatted + " : " + isBefore);

        DayOfWeek dayOfWeek = DayOfWeek.of(currentDate.getDayOfWeek());
        System.out.println("Current day of week is " + dayOfWeek);
    }
}





