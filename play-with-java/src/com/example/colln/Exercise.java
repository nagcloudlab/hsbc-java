package com.example.colln;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {

        String[] csvReport = {
                "1,John,Smith,USA,25",
                "2,Jane,Roberts,Canada,30",
                "3,David,Green,USA,35",
                "4,John,Doe,USA,40",
                "5,David,White,USA,45",
                "6,John,Black,USA,50",
                "7,David,Smith,USA,55",
                "8,John,Green,USA,60",
                "9,David,Roberts,USA,65",
                "10,John,White,USA,70"
        };

        // Count the number of people from each country

        Map<String, Integer> countryCount = new HashMap<>();
        for (String record : csvReport) {
            String[] fields = record.split(",");
            String country = fields[3];

            if (countryCount.containsKey(country)) {
                countryCount.put(country, countryCount.get(country) + 1);
            } else {
                countryCount.put(country, 1);
            }
        }

        System.out.println(countryCount);


    }

}
