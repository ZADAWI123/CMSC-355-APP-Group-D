package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;

import java.util.ArrayList;


public class picDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_display);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();

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

        String programPicFirst = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage1", "");
        String programPicSecond = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage2", "");
        String programPicThird = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage3", "");
        String programPicFourth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage4", "");
        String programPicFifth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage5", "");
        String programPicSixth = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage6", "");

        String firstImage = programPicFirst;
        String secondImage = programPicSecond;
        String thirdImage = programPicThird;
        String fourthImage = programPicFourth;
        String fifthImage = programPicFifth;
        String sixthImage = programPicSixth;

        if(firstImage.equals("pull up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage.equals("barbell row")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(firstImage.equals("deadlift")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(firstImage.equals("lateral pulldown")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(firstImage.equals("bench press")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(firstImage.equals("incline dumbbell")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(firstImage.equals("flat dumbbell")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(firstImage.equals("cable flies")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(firstImage.equals("push up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(firstImage.equals("austrailian pullups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(firstImage.equals("burpees")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(firstImage.equals("spiderman pushups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(firstImage.equals("squats")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("jump squats")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("lounges")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("box jumps")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(firstImage.equals("sit ups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(firstImage.equals("planks")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(firstImage.equals("flutter kicks")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(firstImage.equals("pull up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage.equals("100 meter sprints")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(firstImage.equals("jog for 30 min")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(firstImage.equals("jump rope")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(firstImage.equals("bicycle")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(firstImage.equals("swimming laps")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(firstImage.equals("run 2 miles")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }

        if(secondImage.equals("pull up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage.equals("barbell row")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(firstImage.equals("deadlift")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(firstImage.equals("lateral pulldown")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(firstImage.equals("bench press")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(firstImage.equals("incline dumbbell")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(firstImage.equals("flat dumbbell")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(firstImage.equals("cable flies")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(firstImage.equals("push up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(firstImage.equals("austrailian pullups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(firstImage.equals("burpees")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(firstImage.equals("spiderman pushups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(firstImage.equals("squats")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("jump squats")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("lounges")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage.equals("box jumps")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(firstImage.equals("sit ups")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(firstImage.equals("planks")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(firstImage.equals("flutter kicks")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(firstImage.equals("pull up")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage.equals("100 meter sprints")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(firstImage.equals("jog for 30 min")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(firstImage.equals("jump rope")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(firstImage.equals("bicycle")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(firstImage.equals("swimming laps")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(firstImage.equals("run 2 miles")){
            ImageView firstDisplayPic =  findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(secondImage.equals("pull up")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage.equals("barbell row")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(secondImage.equals("deadlift")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(secondImage.equals("lateral pulldown")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(secondImage.equals("bench press")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(secondImage.equals("incline dumbbell")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(secondImage.equals("flat dumbbell")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(secondImage.equals("cable flies")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(secondImage.equals("push up")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(secondImage.equals("austrailian pullups")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(secondImage.equals("burpees")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(secondImage.equals("spiderman pushups")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(secondImage.equals("squats")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage.equals("jump squats")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage.equals("lounges")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage.equals("box jumps")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(secondImage.equals("sit ups")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(secondImage.equals("planks")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(secondImage.equals("flutter kicks")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(secondImage.equals("pull up")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage.equals("100 meter sprints")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(secondImage.equals("jog for 30 min")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(secondImage.equals("jump rope")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(secondImage.equals("bicycle")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(secondImage.equals("swimming laps")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(secondImage.equals("run 2 miles")){
            ImageView secondDisplayPic =  findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(thirdImage.equals("pull up")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(thirdImage.equals("barbell row")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(thirdImage.equals("deadlift")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(thirdImage.equals("lateral pulldown")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(thirdImage.equals("bench press")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(thirdImage.equals("incline dumbbell")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(thirdImage.equals("flat dumbbell")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(thirdImage.equals("cable flies")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(thirdImage.equals("push up")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(thirdImage.equals("austrailian pullups")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(thirdImage.equals("burpees")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(thirdImage.equals("spiderman pushups")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(thirdImage.equals("squats")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage.equals("jump squats")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage.equals("lounges")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage.equals("box jumps")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(thirdImage.equals("sit ups")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(thirdImage.equals("planks")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(thirdImage.equals("flutter kicks")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(thirdImage.equals("pull up")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(thirdImage.equals("100 meter sprints")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(thirdImage.equals("jog for 30 min")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(thirdImage.equals("jump rope")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(thirdImage.equals("bicycle")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(thirdImage.equals("swimming laps")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(thirdImage.equals("run 2 miles")){
            ImageView thirdDisplayPic =  findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.sprints);
        }

        if(fourthImage.equals("pull up")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fourthImage.equals("barbell row")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(fourthImage.equals("deadlift")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(fourthImage.equals("lateral pulldown")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(fourthImage.equals("bench press")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(fourthImage.equals("incline dumbbell")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(fourthImage.equals("flat dumbbell")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(fourthImage.equals("cable flies")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(fourthImage.equals("push up")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(fourthImage.equals("austrailian pullups")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(fourthImage.equals("burpees")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(fourthImage.equals("spiderman pushups")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(fourthImage.equals("squats")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage.equals("jump squats")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage.equals("lounges")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage.equals("box jumps")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(fourthImage.equals("sit ups")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(fourthImage.equals("planks")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(fourthImage.equals("flutter kicks")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(fourthImage.equals("pull up")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fourthImage.equals("100 meter sprints")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(fourthImage.equals("jog for 30 min")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(fourthImage.equals("jump rope")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(fourthImage.equals("bicycle")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(fourthImage.equals("swimming laps")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(fourthImage.equals("run 2 miles")){
            ImageView fourthDisplayPic =  findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(fifthImage.equals("pull up")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fifthImage.equals("barbell row")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(fifthImage.equals("deadlift")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(fifthImage.equals("lateral pulldown")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(fifthImage.equals("bench press")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(fifthImage.equals("incline dumbbell")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(fifthImage.equals("flat dumbbell")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(fifthImage.equals("cable flies")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(fifthImage.equals("push up")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(fifthImage.equals("austrailian pullups")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(fifthImage.equals("burpees")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(fifthImage.equals("spiderman pushups")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(fifthImage.equals("squats")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage.equals("jump squats")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage.equals("lounges")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage.equals("box jumps")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(fifthImage.equals("sit ups")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(fifthImage.equals("planks")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(fifthImage.equals("flutter kicks")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(fifthImage.equals("pull up")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fifthImage.equals("100 meter sprints")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(fifthImage.equals("jog for 30 min")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(fifthImage.equals("jump rope")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(fifthImage.equals("bicycle")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(fifthImage.equals("swimming laps")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(fifthImage.equals("run 2 miles")){
            ImageView fifthDisplayPic =  findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(sixthImage.equals("pull up")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(sixthImage.equals("barbell row")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(sixthImage.equals("deadlift")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(sixthImage.equals("lateral pulldown")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(sixthImage.equals("bench press")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(sixthImage.equals("incline dumbbell")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(sixthImage.equals("flat dumbbell")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(sixthImage.equals("cable flies")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(sixthImage.equals("push up")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(sixthImage.equals("austrailian pullups")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(sixthImage.equals("burpees")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(sixthImage.equals("spiderman pushups")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(sixthImage.equals("squats")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage.equals("jump squats")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage.equals("lounges")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage.equals("box jumps")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(sixthImage.equals("sit ups")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(sixthImage.equals("planks")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(sixthImage.equals("flutter kicks")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(sixthImage.equals("pull up")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(sixthImage.equals("100 meter sprints")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(sixthImage.equals("jog for 30 min")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(sixthImage.equals("jump rope")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(sixthImage.equals("bicycle")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(sixthImage.equals("swimming laps")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(sixthImage.equals("run 2 miles")){
            ImageView sixthDisplayPic =  findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.sprints);
        }
    }
}