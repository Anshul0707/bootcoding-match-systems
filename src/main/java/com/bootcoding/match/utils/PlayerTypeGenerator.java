package com.bootcoding.match.utils;

import java.util.Random;

public class PlayerTypeGenerator
{
    private static String[] playerType =
            {"Batsman","Bowler","All-rounder","Wicket-keeper"};

    public static String getplayerType()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(playerType.length);
        return playerType[randomIndex];
    }

    public static void main(String[] args) {
        PlayerTypeGenerator.getplayerType();
    }
}
