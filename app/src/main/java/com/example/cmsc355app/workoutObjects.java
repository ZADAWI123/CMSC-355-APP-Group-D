package com.example.cmsc355app;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

    public List<String> getRandomElement(List<String> exStringList, int num) {
        Random rand = new Random();
        List<String> newList = new ArrayList<>();
        for (int i=0; i < num; i++){
            int randomIndex = rand.nextInt(exStringList.size());
            newList.add(exStringList.get(randomIndex));
            exStringList.remove(randomIndex);

        }
        return newList;
    }
    public List<Integer> getRandomNumber(int num){
        Random randNum = new Random();
        int n = num;
        List<Integer> numList = new ArrayList<>(n);
        for (int i = 1; i <= num; i++){
            int randomInt = randNum.nextInt(10);
            numList.add(randomInt + i);
        }
        return numList;
    }

    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.wtBtn:
                TextView exList = (TextView) view.findViewById(R.id.exList);
                TextView setList = (TextView) view.findViewById(R.id.numOfReps);

                int num = 4;
                List <String> weightList = new ArrayList<>();
                ArrayList<String> printList = new ArrayList<String>();
                ArrayList<Integer> printSet = new ArrayList<>();
                weightList.add("pull up");
                weightList.add("barbell row");
                weightList.add("deadlift");
                weightList.add("lateral pulldown");
                weightList.add("bench press");
                weightList.add("incline dumbbell");
                weightList.add("flat dumbbell");
                weightList.add("cable flies");


                printList= (ArrayList<String>)getRandomElement(weightList,num);
                printSet = (ArrayList<Integer>)getRandomNumber(num);
                exList.setText(Arrays.toString(printList.toArray()));
                setList.setText(Arrays.toString(printSet.toArray()));

//            ArrayList legWeight = new ArrayList();
//            legWeight.add("leg curls");
//            legWeight.add("leg extentions");
//            legWeight.add("leg press");
//            legWeight.add("barbell squats");
//
//
//            ArrayList chestWeight = new ArrayList();
//            chestWeight.add("bench press");
//            chestWeight.add("incline dumbbell");
//            chestWeight.add("flat dumbbell");
//            chestWeight.add("cable flies");



//            Object[] backWeightArray = backWeight.toArray();
//            Object[] chestWeightArray = backWeight.toArray();
//            Object[] legWeightArray = backWeight.toArray();

            break;
        }
    }
}