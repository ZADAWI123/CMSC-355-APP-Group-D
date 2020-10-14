package com.example.cmsc355app;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class workoutObjects {

//    String workout1, workout2, workout3, workout4;
//
//    public workoutObjects(String workout1, String workout2, String workout3, String workout4){
//        this.workout1 = workout1;
//        this.workout2 = workout2;
//        this.workout2 = workout2;
//        this.workout2 = workout2;
//    }
//
//    public String getWorkout1(){
//        return workout1;
//    }
//    public String getWorkout2(){
//        return workout2;
//    }
//    public String getWorkout3(){
//        return workout3;
//    }
//    public String getWorkout4(){
//        return workout4;
//    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.wtBtn:
                TextView exList = (TextView) view.findViewById(R.id.exList);

            ArrayList backWeight = new ArrayList();
            backWeight.add("pull up");
            backWeight.add("barbell row");
            backWeight.add("deadlift");
            backWeight.add("lateral pulldown");

            ArrayList legWeight = new ArrayList();
            legWeight.add("leg curls");
            legWeight.add("leg extentions");
            legWeight.add("leg press");
            legWeight.add("barbell squats");


            ArrayList chestWeight = new ArrayList();
            chestWeight.add("bench press");
            chestWeight.add("incline dumbbell");
            chestWeight.add("flat dumbbell");
            chestWeight.add("cable flies");



//            Object[] backWeightArray = backWeight.toArray();
//            Object[] chestWeightArray = backWeight.toArray();
//            Object[] legWeightArray = backWeight.toArray();

            break;
        }
    }
}