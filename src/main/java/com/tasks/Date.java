package com.tasks;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.DayOfWeek;

public class Date{
    private static DateTimeFormatter formatter_YYYY_MM_DD = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static DateTimeFormatter formatter_MM_DD_YYYY = DateTimeFormat.forPattern("MM/dd/yyyy");
    private static DateTimeFormatter formatter_DD_MM_YYYY = DateTimeFormat.forPattern("dd-MM-yyyy");
    private static DateTimeFormatter longFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        DateTime currentDate = new DateTime();
        System.out.println("Current date: " + currentDate);
        String input = precondition(currentDate);
        task1(precondition(currentDate),formatter_YYYY_MM_DD,formatter_MM_DD_YYYY);
        task2(precondition(currentDate),formatter_YYYY_MM_DD,formatter_DD_MM_YYYY);
        task3(precondition(currentDate),formatter_YYYY_MM_DD,formatter_DD_MM_YYYY);


        DateTime formattedDate = formatter_YYYY_MM_DD.parseDateTime(currentDate.toString());
        System.out.println(precondition(currentDate));


        System.out.println("Formatted current date: " + formatter_MM_DD_YYYY.print(formattedDate));
        String currentDateFormatted = formatter_DD_MM_YYYY.print(formattedDate);
        System.out.println("Formatted current date: " + currentDateFormatted);

        System.out.println("Time in long at the start of day: " + formattedDate.withTimeAtStartOfDay().getMillis());
        long longDate = formattedDate.millisOfDay().withMaximumValue().getMillis();
        System.out.println("Time in long at the end of day: " + longDate);

        DateTimeFormatter convertLongToStr = DateTimeFormat.forPattern("yyyy-MM-dd.HH.mm.ss.SS");
        System.out.println("Formatted current date and time: " + convertLongToStr.print(longDate));

        LocalDate dateForCompare = new LocalDate(968498900000L);
        String dateInFutureFormatted = formatter_DD_MM_YYYY.print(dateForCompare);
//        boolean isBefore = currentDate.isBefore(dateForCompare);
//        System.out.println(currentDateFormatted + " is before " + dateInFutureFormatted + " : " + isBefore);

        DayOfWeek dayOfWeek = DayOfWeek.of(currentDate.getDayOfWeek());
        System.out.println("Current day of week is " + dayOfWeek);
    }


    private static String precondition(DateTime date) {
        return formatter_YYYY_MM_DD.print(date);
    }

    private static String task1(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }

    private static String task2(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }
    private static String task3(String date, DateTimeFormatter inputFormatter, DateTimeFormatter outputFormatter) {
        return outputFormatter.print(inputFormatter.parseDateTime(date));
    }
}





