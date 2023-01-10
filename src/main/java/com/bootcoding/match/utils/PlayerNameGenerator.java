package com.bootcoding.match.utils;

import java.util.Random;

public class PlayerNameGenerator
{
    private static String[] playerName =
            {"Ramesh", "Suresh", "Jayesh", "Ganesh",
                    "Mahesh", "Rajesh", "Mitesh", "Dinesh",
                    "Pooja", "Priya", "Pinky",
                    "Manisha", "Usha", "Asha", "Diksha", "Nisha"};

    public static String getName()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(playerName.length);
        return playerName[randomIndex];
    }

    public static void main(String[] args) {
        PlayerNameGenerator.getName();
    }
}
