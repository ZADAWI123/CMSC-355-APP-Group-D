package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.Iterator;

public class workExamples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_instructions);

        ArrayList<String> exerciseImages = new ArrayList <String>();

        exerciseImages.add("pull up");
        exerciseImages.add("barbell row");
        exerciseImages.add("deadlift");
        exerciseImages.add("lateral pulldown");
        exerciseImages.add("bench press");
        exerciseImages.add("incline dumbbell");
        exerciseImages.add("flat dumbbell");
        exerciseImages.add("cable flies");
        exerciseImages.add("push up");
        exerciseImages.add("austrailian pullups");
        exerciseImages.add("burpees");
        exerciseImages.add("spiderman pushups");
        exerciseImages.add("squats");
        exerciseImages.add("jump squats");
        exerciseImages.add("lounges");
        exerciseImages.add("box jumps");
        exerciseImages.add("sit ups");
        exerciseImages.add("planks");
        exerciseImages.add("flutter kicks");
        exerciseImages.add("100 meter sprints");
        exerciseImages.add("jog for 30 min");
        exerciseImages.add("jump rope");
        exerciseImages.add("bicycle");
        exerciseImages.add("swimming laps");
        exerciseImages.add("run 2 miles");


        final int programImage = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programImage", 0);


        Iterator<String> itr = exerciseImages.iterator();
        while (itr.hasNext()) {
            }

        }
    }
