package com.bootcoding.match.utils;

import java.util.Random;

public class IdGenerator
{
    private static int[] id = {1,2,3,4,5,6,7,8,9};

    public static int getId()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(id.length);
        return id[randomIndex];
    }

    public static void main(String[] args) {
        IdGenerator.getId();
    }
}
