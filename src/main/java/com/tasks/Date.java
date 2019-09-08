package com.tasks;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalDateTime currentTime = LocalDateTime.now();


        String date = String.valueOf(currentDate);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime jodaTime = dtf.parseDateTime(date);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        System.out.println(dtfOut.print(jodaTime));
        DateTimeFormatter dateformatOut = DateTimeFormat.forPattern("dd-MM-yyyy");
        System.out.println(dateformatOut.print(jodaTime));

        System.out.println(jodaTime.withTimeAtStartOfDay().getMillis());
        System.out.println(jodaTime.millisOfDay().withMaximumValue().getMillis());





    }
}





