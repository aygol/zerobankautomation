package com.zerobank.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeUtulities {

    /**
     * This method returns current date as a string.
     * Provide a format as a parameter
     *
     * MM - to specify month like: 01, 02, 03,
     * MMM - to specify month like: Jan, Feb, Mar
     *
     * dd - to specify day, like 01, 02, 03
     *
     * yyyy - to specify year like: 2010, 2020
     *
     * @param format for example: MMM dd, yyyy = Mar 29, 2020
     * @return current date as a string
     *
     * https://www.journaldev.com/17899/java-simpledateformat-java-date-format
     */
    public static String getCurrentDate(String format){
        return LocalDate.now().format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * This method returns difference between end and start time
     * @param start time
     * @param end time
     * @param format like h:m a --> 5:15 AM, 8:07 PM
     * @return difference between end time and start time as a long
     */
    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end, DateTimeFormatter.ofPattern(format));
        return ChronoUnit.HOURS.between(startTime, endTime);
    }



    public static boolean verifyDateFallsInRange(String from, String to, String target){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date beforeDate = new Date();
        Date afterDate = new Date();
        Date targetDate = new Date();
        try {
            beforeDate= format.parse(from);
            afterDate= format.parse(to);
            targetDate = format.parse(target);
        }catch(ParseException e) {
            e.printStackTrace();
        }
        if(targetDate.before(beforeDate) || targetDate.after(afterDate)){
            return false;
        }
        return true;
    }

    public static boolean isAfter(String date1, String date2){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date first = new Date();
        Date after = new Date();

        try {
            first = format.parse(date1);
            after = format.parse(date2);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        if(first.after(after)){
            return true;
        }
        return false;
    }
}


