package com.example.cmsc355app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerateTest {

    public static void main(String[] args)
    {

        // create a list of Integer type
        List<String> list = new ArrayList<>();

        list.add("You are a Machine");
        list.add("You can do this!");
        list.add("It all starts with you.");
        list.add("Your limitation—it's only your imagination.");
        list.add("Sometimes later becomes never.");

        RandomGenerateTest obj = new RandomGenerateTest();

        System.out.println(obj.getRandomQuote(list));
    }

    public String getRandomQuote(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
