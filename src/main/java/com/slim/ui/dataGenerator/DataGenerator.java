package com.slim.ui.dataGenerator;

import com.github.javafaker.Faker;

public class DataGenerator {

    private static Faker faker = new Faker();

    public static String getUserName() {
        return faker.name().username();
    }

    public static String getTime(int maxHours, int minHours) {
        return String.valueOf(faker.number().numberBetween(minHours, maxHours)) + ":"
                + String.valueOf(faker.number().numberBetween(10, 59));
    }
}
