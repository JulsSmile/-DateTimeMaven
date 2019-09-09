package com.tasks;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

import static org.joda.time.DateTimeFieldType.dayOfWeek;

public class Date{

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        String date = String.valueOf(currentDate);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime jodaTime = dtf.parseDateTime(date);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        System.out.println(dtfOut.print(jodaTime));
        DateTimeFormatter dateformatOut = DateTimeFormat.forPattern("dd-MM-yyyy");
        System.out.println(dateformatOut.print(jodaTime));

        System.out.println(jodaTime.withTimeAtStartOfDay().getMillis());
        long longDate = jodaTime.millisOfDay().withMaximumValue().getMillis();
        System.out.println(longDate);

        DateTimeFormatter convertLongToStr = DateTimeFormat.forPattern("yyyy-MM-dd.HH.mm.ss.SS");
        System.out.println(convertLongToStr.print(longDate));

//       String dayOfWeek = String.valueOf(dayOfWeek(longDate));
//        System.out.println(dayOfWeek);
//
//
//    }
//    private static Object dayOfWeek(long longDate) {
//        return String.valueOf(dayOfWeek(longDate));
    }

}





