package com.slim.ui.dataGenerator;

import com.github.javafaker.Faker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DataGenerator {

    private static Faker faker = new Faker();

    public static String getUserName() {
        return faker.name().username();
    }
    public static String getText() {
        return faker.chuckNorris().fact();
    }

    public static String getTime(int maxHours, int minHours) {
        return String.valueOf(faker.number().numberBetween(minHours, maxHours)) + ":"
                + String.valueOf(faker.number().numberBetween(11, 19));
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));
        return dateFormat.format(currentDate);
    }

    public static String getFutureDate(int addDays) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));

        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, addDays);

        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));

        return dateFormat.format(currentDatePlusOne);
    }
}
