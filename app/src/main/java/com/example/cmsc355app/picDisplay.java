package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

        if(firstImage==("pull up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage==("barbell row")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(firstImage==("deadlift")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(firstImage==("lateral pulldown")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(firstImage==("bench press")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(firstImage==("incline dumbbell")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(firstImage==("flat dumbbell")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(firstImage==("cable flies")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(firstImage==("push up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(firstImage==("austrailian pullups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(firstImage==("burpees")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(firstImage==("spiderman pushups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(firstImage==("squats")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("jump squats")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("lounges")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("box jumps")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(firstImage==("sit ups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(firstImage==("planks")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(firstImage==("flutter kicks")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(firstImage==("pull up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage==("100 meter sprints")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(firstImage==("jog for 30 min")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(firstImage==("jump rope")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(firstImage==("bicycle")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(firstImage==("swimming laps")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(firstImage==("run 2 miles")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }




        if(secondImage==("pull up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage==("barbell row")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(firstImage==("deadlift")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(firstImage==("lateral pulldown")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(firstImage==("bench press")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(firstImage==("incline dumbbell")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(firstImage==("flat dumbbell")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(firstImage==("cable flies")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(firstImage==("push up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(firstImage==("austrailian pullups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(firstImage==("burpees")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(firstImage==("spiderman pushups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(firstImage==("squats")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("jump squats")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("lounges")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(firstImage==("box jumps")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(firstImage==("sit ups")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(firstImage==("planks")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(firstImage==("flutter kicks")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(firstImage==("pull up")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(firstImage==("100 meter sprints")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(firstImage==("jog for 30 min")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(firstImage==("jump rope")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(firstImage==("bicycle")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(firstImage==("swimming laps")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(firstImage==("run 2 miles")){
            ImageView firstDisplayPic = (ImageView) findViewById(R.id.firstImagePic);
            firstDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(secondImage==("pull up")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage==("barbell row")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(secondImage==("deadlift")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(secondImage==("lateral pulldown")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(secondImage==("bench press")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(secondImage==("incline dumbbell")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(secondImage==("flat dumbbell")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(secondImage==("cable flies")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(secondImage==("push up")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(secondImage==("austrailian pullups")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(secondImage==("burpees")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(secondImage==("spiderman pushups")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(secondImage==("squats")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage==("jump squats")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage==("lounges")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(secondImage==("box jumps")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(secondImage==("sit ups")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(secondImage==("planks")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(secondImage==("flutter kicks")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(secondImage==("pull up")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(secondImage==("100 meter sprints")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(secondImage==("jog for 30 min")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(secondImage==("jump rope")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(secondImage==("bicycle")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(secondImage==("swimming laps")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(secondImage==("run 2 miles")){
            ImageView secondDisplayPic = (ImageView) findViewById(R.id.secondImagePic);
            secondDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(thirdImage==("pull up")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(thirdImage==("barbell row")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(thirdImage==("deadlift")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(thirdImage==("lateral pulldown")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(thirdImage==("bench press")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(thirdImage==("incline dumbbell")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(thirdImage==("flat dumbbell")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(thirdImage==("cable flies")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(thirdImage==("push up")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(thirdImage==("austrailian pullups")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(thirdImage==("burpees")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(thirdImage==("spiderman pushups")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(thirdImage==("squats")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage==("jump squats")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage==("lounges")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(thirdImage==("box jumps")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(thirdImage==("sit ups")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(thirdImage==("planks")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(thirdImage==("flutter kicks")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(thirdImage==("pull up")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(thirdImage==("100 meter sprints")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(thirdImage==("jog for 30 min")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(thirdImage==("jump rope")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(thirdImage==("bicycle")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(thirdImage==("swimming laps")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(thirdImage==("run 2 miles")){
            ImageView thirdDisplayPic = (ImageView) findViewById(R.id.thirdImagePic);
            thirdDisplayPic.setImageResource(R.drawable.sprints);
        }

        if(fourthImage==("pull up")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fourthImage==("barbell row")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(fourthImage==("deadlift")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(fourthImage==("lateral pulldown")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(fourthImage==("bench press")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(fourthImage==("incline dumbbell")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(fourthImage==("flat dumbbell")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(fourthImage==("cable flies")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(fourthImage==("push up")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(fourthImage==("austrailian pullups")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(fourthImage==("burpees")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(fourthImage==("spiderman pushups")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(fourthImage==("squats")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage==("jump squats")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage==("lounges")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fourthImage==("box jumps")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(fourthImage==("sit ups")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(fourthImage==("planks")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(fourthImage==("flutter kicks")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(fourthImage==("pull up")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fourthImage==("100 meter sprints")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(fourthImage==("jog for 30 min")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(fourthImage==("jump rope")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(fourthImage==("bicycle")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(fourthImage==("swimming laps")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(fourthImage==("run 2 miles")){
            ImageView fourthDisplayPic = (ImageView) findViewById(R.id.fourthImagePic);
            fourthDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(fifthImage==("pull up")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fifthImage==("barbell row")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(fifthImage==("deadlift")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(fifthImage==("lateral pulldown")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(fifthImage==("bench press")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(fifthImage==("incline dumbbell")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(fifthImage==("flat dumbbell")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(fifthImage==("cable flies")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(fifthImage==("push up")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(fifthImage==("austrailian pullups")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(fifthImage==("burpees")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(fifthImage==("spiderman pushups")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(fifthImage==("squats")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage==("jump squats")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage==("lounges")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(fifthImage==("box jumps")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(fifthImage==("sit ups")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(fifthImage==("planks")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(fifthImage==("flutter kicks")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(fifthImage==("pull up")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(fifthImage==("100 meter sprints")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(fifthImage==("jog for 30 min")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(fifthImage==("jump rope")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(fifthImage==("bicycle")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(fifthImage==("swimming laps")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(fifthImage==("run 2 miles")){
            ImageView fifthDisplayPic = (ImageView) findViewById(R.id.fifthImagePic);
            fifthDisplayPic.setImageResource(R.drawable.sprints);
        }
        if(sixthImage==("pull up")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(sixthImage==("barbell row")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.barbellrow);
        }
        else if(sixthImage==("deadlift")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.deadlift);
        }
        else if(sixthImage==("lateral pulldown")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.latpulldown);
        }
        else if(sixthImage==("bench press")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.benchpress);
        }
        else if(sixthImage==("incline dumbbell")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.inclinedumbbellpress);
        }
        else if(sixthImage==("flat dumbbell")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.dumbbellpress);
        }
        else if(sixthImage==("cable flies")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.chestflies);
        }
        else if(sixthImage==("push up")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pushup);
        }
        else if(sixthImage==("austrailian pullups")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.austrialian);
        }
        else if(sixthImage==("burpees")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.burpee);
        }
        else if(sixthImage==("spiderman pushups")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.spiderman);
        }
        else if(sixthImage==("squats")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage==("jump squats")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage==("lounges")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.bodyweightsquat);
        }
        else if(sixthImage==("box jumps")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.boxjump);
        }
        else if(sixthImage==("sit ups")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.situp);
        }
        else if(sixthImage==("planks")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.plank);
        }
        else if(sixthImage==("flutter kicks")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.flutterkicks);
        }
        else if(sixthImage==("pull up")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.pullup);
        }
        else if(sixthImage==("100 meter sprints")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.sprints);
        }
        else if(sixthImage==("jog for 30 min")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.jog);
        }
        else if(sixthImage==("jump rope")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.jumprope);
        }
        else if(sixthImage==("bicycle")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.cycle);
        }
        else if(sixthImage==("swimming laps")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.swim);
        }
        else if(sixthImage==("run 2 miles")){
            ImageView sixthDisplayPic = (ImageView) findViewById(R.id.sixthImagePic);
            sixthDisplayPic.setImageResource(R.drawable.sprints);
        }
    }
}