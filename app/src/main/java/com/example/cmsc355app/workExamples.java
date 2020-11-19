package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class workExamples extends AppCompatActivity {

    @SuppressWarnings("checkstyle:Indentation")
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



        //final String programPic = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", "");

        String programPicFirst = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
        String programPicSecond = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
        String programPicThird = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
        String programPicFourth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
        String programPicFifth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
        String programPicSixth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", null);
//        String programPicInt = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImageInt", null);
//        String programPicHard = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImageHard", null);

        List<String> firstImage = Arrays.asList(programPicFirst.split("\\s*,\\s*"));
        List<String> secondImage = Arrays.asList(programPicSecond.split("\\s*,\\s*"));
        List<String> thirdImage = Arrays.asList(programPicThird.split("\\s*,\\s*"));
        List<String> fourthImage = Arrays.asList(programPicFourth.split("\\s*,\\s*"));
        List<String> fifthImage = Arrays.asList(programPicFifth.split("\\s*,\\s*"));
        List<String> sixthImage = Arrays.asList(programPicSixth.split("\\s*,\\s*"));
//        List<String> intList = Arrays.asList(programPicInt.split("\\s*,\\s*"));
//        List<String> hardList = Arrays.asList(programPicHard.split("\\s*,\\s*"));

        Iterator<String> itr = exerciseImages.iterator();
        while (itr.hasNext()) {
            if (exerciseImages.contains(firstImage)){
                if(firstImage.contains("pull up")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.pullup);
                }
                else if(firstImage.contains("barbell row")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.barbellrow);
                }
                else if(firstImage.contains("deadlift")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.deadlift);
                }
                else if(firstImage.contains("lateral pulldown")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.latpulldown);
                }
                else if(firstImage.contains("bench press")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.benchpress);
                }
                else if(firstImage.contains("incline dumbbell")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
                }
                else if(firstImage.contains("flat dumbbell")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.dumbbellpress);
                }
                else if(firstImage.contains("cable flies")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.chestflies);
                }
                else if(firstImage.contains("push up")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.pushup);
                }
                else if(firstImage.contains("austrailian pullups")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.austrialian);
                }
                else if(firstImage.contains("burpees")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.burpee);
                }
                else if(firstImage.contains("spiderman pushups")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.spiderman);
                }
                else if(firstImage.contains("squats")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
                }
                else if(firstImage.contains("jump squats")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
                }
                else if(firstImage.contains("lounges")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
                }
                else if(firstImage.contains("box jumps")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.boxjump);
                }
                else if(firstImage.contains("sit ups")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.situp);
                }
                else if(firstImage.contains("planks")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.plank);
                }
                else if(firstImage.contains("flutter kicks")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.flutterkicks);
                }
                else if(firstImage.contains("pull up")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.pullup);
                }
                else if(firstImage.contains("100 meter sprints")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.sprints);
                }
                else if(firstImage.contains("jog for 30 min")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.jog);
                }
                else if(firstImage.contains("jump rope")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.jumprope);
                }
                else if(firstImage.contains("bicycle")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.cycle);
                }
                else if(firstImage.contains("swimming laps")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.swim);
                }
                else if(firstImage.contains("run 2 miles")){
                    ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
                    firstDisplayPic.setImageResource(R.drawable.sprints);
                }


                }

            }
        }

    }