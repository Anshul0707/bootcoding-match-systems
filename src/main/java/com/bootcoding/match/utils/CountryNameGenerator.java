package com.bootcoding.match.utils;

import java.util.Random;

public class CountryNameGenerator
{
    private static String[] CountryName =
            {" Afghanistan", "Australia", "Bangladesh", " England",
                    " India", " Ireland", "New Zealand", "Pakistan",
                    "South Africa", "Sri Lanka", "West Indies",
                    "Zimbabwe"};

    public static String getCountryName()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(CountryName.length);
        return CountryName[randomIndex];
    }

    public static void main(String[] args) {
        CountryNameGenerator.getCountryName();
    }
}
