package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class workout_tab extends AppCompatActivity {

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

    Random randNum = new Random();
    public List<Integer> getRandomNumber(int num){
        int n = num;
        int low = 5;
        int range = 10;
        List<Integer> numList = new ArrayList<>(n);
        for (int i = 1; i <= num; i++){
            int randomInt = randNum.nextInt(range)+ low;
            numList.add(randomInt);
        }
        return numList;
    }

    public List<Integer> getRandomSet(int num){
        int n = num;
        int low = 3;
        int range = 3;
        List<Integer> numList = new ArrayList<>(n);
        for (int i = 1; i <= num; i++){
            int randomInt = randNum.nextInt(range)+ low;
            numList.add(randomInt);
        }
        return numList;
    }

    String temp = "";
    String temp2 = "";
    public void displayWorkouts(){
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();

        final int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final String numIndicator = Integer.toString(programIndicator);

        final String [] favoriteE = {myPrefs.getString("e1","")};
        final String [] favoriteE2 = {myPrefs.getString("e2","")};
        final String [] favoriteE3 = {myPrefs.getString("e3","")};
        final String [] favoriteE4 = {myPrefs.getString("e4","")};
        final String [] favoriteE5 = {myPrefs.getString("e5","")};
        final String [] favoriteE6 = {myPrefs.getString("e6","")};

        final String [] favoriteR = {myPrefs.getString("r1","")};
        final String [] favoriteR2 = {myPrefs.getString("r2","")};
        final String [] favoriteR3 = {myPrefs.getString("r3","")};
        final String [] favoriteR4 = {myPrefs.getString("r4","")};
        final String [] favoriteR5 = {myPrefs.getString("r5","")};
        final String [] favoriteR6 = {myPrefs.getString("r6","")};

        final String [] favoriteS = {myPrefs.getString("s1","")};
        final String [] favoriteS2 = {myPrefs.getString("s2","")};
        final String [] favoriteS3 = {myPrefs.getString("s3","")};
        final String [] favoriteS4 = {myPrefs.getString("s4","")};
        final String [] favoriteS5 = {myPrefs.getString("s5","")};
        final String [] favoriteS6 = {myPrefs.getString("s6","")};

        final TextView exercise1 = findViewById(R.id.ex1);
        final TextView exercise2 = findViewById(R.id.ex2);
        final TextView exercise3 = findViewById(R.id.ex3);
        final TextView exercise4 = findViewById(R.id.ex4);
        final TextView exerciseInt = findViewById(R.id.exInt);
        final TextView exerciseHard = findViewById(R.id.exHard);

        final TextView sets1 = findViewById(R.id.sets1);
        final TextView sets2 = findViewById(R.id.sets2);
        final TextView sets3 = findViewById(R.id.sets3);
        final TextView sets4 = findViewById(R.id.sets4);
        final TextView setsInt = findViewById(R.id.setsInt);
        final TextView setsHard = findViewById(R.id.setsHard);

        final TextView rest1 = findViewById(R.id.rest1);
        final TextView rest2 = findViewById(R.id.rest2);
        final TextView rest3 = findViewById(R.id.rest3);
        final TextView rest4 = findViewById(R.id.rest4);
        final TextView restInt = findViewById(R.id.restInt);
        final TextView restHard = findViewById(R.id.restHard);

        int num = 6;
        List<String> weightList = new ArrayList<>();
        List<String> bodyweightList = new ArrayList<>();
        List<String> cardioList = new ArrayList<>();
        List<String> restList = new ArrayList<>();
        ArrayList<String> printList = new ArrayList<String>();
        ArrayList<Integer> printSet = new ArrayList<>();
        ArrayList<Integer> printRep = new ArrayList<>();
        ArrayList<String> printRestSet = new ArrayList<>();

        weightList.add("pull up");
        weightList.add("barbell row");
        weightList.add("deadlift");
        weightList.add("lateral pulldown");
        weightList.add("bench press");
        weightList.add("incline dumbbell");
        weightList.add("flat dumbbell");
        weightList.add("cable flies");

        bodyweightList.add("push up");
        bodyweightList.add("pull ups");
        bodyweightList.add("austrailian pullups");
        bodyweightList.add("burpees");
        bodyweightList.add("spiderman pushups");

        bodyweightList.add("squats");
        bodyweightList.add("jump squats");
        bodyweightList.add("lounges");
        bodyweightList.add("box jumps");

        bodyweightList.add("sit ups");
        bodyweightList.add("planks");
        bodyweightList.add("flutter kicks");

        cardioList.add("100 meter sprints");
        cardioList.add("jog for 30 min");
        cardioList.add("jump rope");
        cardioList.add("bicycle");
        cardioList.add("swimming laps");
        cardioList.add("run 2 miles");

        restList.add("rest for 30 secs");
        restList.add("rest for 1 minute");
        restList.add("rest for 2 minutes");
        restList.add("rest for 3 minutes");
        restList.add("rest fully");
        restList.add("less than 5 seconds");

        if(programIndicator == 1){
            printList= (ArrayList<String>)getRandomElement(weightList,num);
            printSet = (ArrayList<Integer>)getRandomSet(num);
            printRep = (ArrayList<Integer>)getRandomNumber(num);
            printRestSet=(ArrayList<String>)getRandomElement(restList,num);


        }
        if(programIndicator == 2){
            printList= (ArrayList<String>)getRandomElement(bodyweightList,num);
            printSet = (ArrayList<Integer>)getRandomSet(num);
            printRep = (ArrayList<Integer>)getRandomNumber(num);
            printRestSet=(ArrayList<String>)getRandomElement(restList,num);

        }

        if(programIndicator == 3){
            printList= (ArrayList<String>)getRandomElement(cardioList,num);
            printSet = (ArrayList<Integer>)getRandomSet(num);
            printRep = (ArrayList<Integer>)getRandomNumber(num);
            printRestSet=(ArrayList<String>)getRandomElement(restList,num);

        }

        final String ex1 = printList.get(0);
        final String ex2 = printList.get(1);
        final String ex3 = printList.get(2);
        final String ex4 = printList.get(3);
        final String exInt = printList.get(4);
        final String exHard = printList.get(5);

        final String set1 = Integer.toString(printSet.get(0)) + " sets x " + (printRep.get(0)) + " reps";
        final String set2 = Integer.toString(printSet.get(1)) + " sets x "+ (printRep.get(1))+ " reps";
        final String set3 = Integer.toString(printSet.get(2)) + " sets x "+ (printRep.get(2))+ " reps";
        final String set4 = Integer.toString(printSet.get(3)) + " sets x "+ (printRep.get(3))+ " reps";
        final String setInt = Integer.toString(printSet.get(4)) + " sets x "+ (printRep.get(4))+ " reps";
        final String setHard = Integer.toString(printSet.get(5)) + " sets x "+ (printRep.get(5))+ " reps";

        final String rst1 = printRestSet.get(0);
        final String rst2 = printRestSet.get(1);
        final String rst3 = printRestSet.get(2);
        final String rst4 = printRestSet.get(3);
        final String rstInt = printRestSet.get(4);
        final String rstHard = printRestSet.get(4);

        Button fav = findViewById(R.id.fav);

        final ArrayList<String> finalPrintList = printList;
        final ArrayList<String> finalPrintRestSet = printRestSet;
        final ArrayList<Integer> finalPrintSet = printSet;
        final ArrayList<Integer> finalPrintRep = printRep;

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){
                    Toast.makeText(getApplicationContext(), "Select a workout program :)", Toast.LENGTH_SHORT).show();
                }else{
                    myEditor.putString("e1", favoriteE[0] = finalPrintList.get(0)).apply();
                    myEditor.putString("e2", favoriteE2[0] = finalPrintList.get(1)).apply();
                    myEditor.putString("e3", favoriteE3[0] = finalPrintList.get(2)).apply();
                    myEditor.putString("e4", favoriteE4[0] = finalPrintList.get(3)).apply();

                    myEditor.putString("r1", favoriteR[0] = finalPrintRestSet.get(0)).apply();
                    myEditor.putString("r2", favoriteR2[0] = finalPrintRestSet.get(1)).apply();
                    myEditor.putString("r3", favoriteR3[0] = finalPrintRestSet.get(2)).apply();
                    myEditor.putString("r4", favoriteR4[0] = finalPrintRestSet.get(3)).apply();

                    myEditor.putString("s1", favoriteS[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();
                    myEditor.putString("s2", favoriteS2[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();
                    myEditor.putString("s3", favoriteS3[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();
                    myEditor.putString("s4", favoriteS4[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();

                    myEditor.putString("e5", favoriteE5[0] = " ").apply();
                    myEditor.putString("r5", favoriteR5[0] = " ").apply();
                    myEditor.putString("s5", favoriteS5[0] = " ").apply();

                    myEditor.putString("e6", favoriteE6[0] = " ").apply();
                    myEditor.putString("r6", favoriteR6[0] = " ").apply();
                    myEditor.putString("s6", favoriteS6[0] = " ").apply();

                    if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("easy",false) == true
                            && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("intermediate",false) == true
                            && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("hard",false) == false) {
                        myEditor.putString("e5", favoriteE5[0] = finalPrintList.get(4)).apply();
                        myEditor.putString("r5", favoriteR5[0] = finalPrintRestSet.get(4)).apply();
                        myEditor.putString("s5", favoriteS5[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();

                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("easy",false) == true
                            && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("intermediate",false) == true
                            && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("hard",false) == true) {
                        myEditor.putString("e5", favoriteE5[0] = finalPrintList.get(4)).apply();
                        myEditor.putString("r5", favoriteR5[0] = finalPrintRestSet.get(4)).apply();
                        myEditor.putString("s5", favoriteS5[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();

                        myEditor.putString("e6", favoriteE6[0] = finalPrintList.get(5)).apply();
                        myEditor.putString("r6", favoriteR6[0] = finalPrintRestSet.get(5)).apply();
                        myEditor.putString("s6", favoriteS6[0] = String.valueOf(finalPrintSet.get(0) + " sets x " + finalPrintRep.get(0) + " reps")).apply();

                    }
                }
            }
        });

        sets1.setText(set1);
        sets2.setText(set2);
        sets3.setText(set3);
        sets4.setText(set4);
        rest1.setText(rst1);
        rest2.setText(rst2);
        rest3.setText(rst3);
        rest4.setText(rst4);
        exercise1.setText(ex1);
        exercise2.setText(ex2);
        exercise3.setText(ex3);
        exercise4.setText(ex4);
        exerciseInt.setText(null);
        restInt.setText(null);
        setsInt.setText(null);
        setsHard.setText(null);
        restHard.setText(null);
        exerciseHard.setText(null);


        final String [] imageArray = {myPrefs.getString("programImage", String.valueOf(0))};
        if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("easy",false) == true
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("intermediate",false) == false
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("hard",false) == false) {
            SharedPreferences.Editor myEditorPicEasy = myPrefs.edit();
            ArrayList<String> easyList = new ArrayList<String>();
            sets1.setText(set1);
            sets2.setText(set2);
            sets3.setText(set3);
            sets4.setText(set4);
            rest1.setText(rst1);
            rest2.setText(rst2);
            rest3.setText(rst3);
            rest4.setText(rst4);
            exercise1.setText(ex1);
            exercise2.setText(ex2);
            exercise3.setText(ex3);
            exercise4.setText(ex4);
            easyList.add(ex4);
            easyList.add(ex1);
            easyList.add(ex2);
            easyList.add(ex3);
            exerciseInt.setText(null);
            restInt.setText(null);
            setsInt.setText(null);
            setsHard.setText(null);
            restHard.setText(null);
            exerciseHard.setText(null);
            String easyString = TextUtils.join(",", easyList);
            myEditorPicEasy.putString("programImage", imageArray[0] = easyString).apply();
            PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putString("programImage", imageArray[0]).apply();
        }
        else if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("easy",false) == true
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("intermediate",false) == true
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("hard",false) == false) {
            SharedPreferences.Editor myEditorPicInt = myPrefs.edit();
            ArrayList<String> intList = new ArrayList<String>();
            sets1.setText(set1);
            sets2.setText(set2);
            sets3.setText(set3);
            sets4.setText(set4);
            rest1.setText(rst1);
            rest2.setText(rst2);
            rest3.setText(rst3);
            rest4.setText(rst4);
            exercise1.setText(ex1);
            exercise2.setText(ex2);
            exercise3.setText(ex3);
            exercise4.setText(ex4);
            setsInt.setText(setInt);
            restInt.setText(rstInt);
            exerciseInt.setText(exInt);
            intList.add(ex1);
            intList.add(ex2);
            intList.add(ex3);
            intList.add(ex4);
            intList.add(exInt);
            exerciseHard.setText(null);
            setsHard.setText(null);
            restHard.setText(null);
            String intString = TextUtils.join(",", intList);
            myEditorPicInt.putString("programImage", imageArray[0] = intString).apply();
            PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putString("programImage", imageArray[0]).apply();
        }
        else if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("easy",false) == true
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("intermediate",false) == true
                && PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean("hard",false) == true) {
            SharedPreferences.Editor myEditorPicHard = myPrefs.edit();
            ArrayList<String> hardList = new ArrayList<String>();
            sets1.setText(set1);
            sets2.setText(set2);
            sets3.setText(set3);
            sets4.setText(set4);
            rest1.setText(rst1);
            rest2.setText(rst2);
            rest3.setText(rst3);
            rest4.setText(rst4);
            exercise1.setText(ex1);
            exercise2.setText(ex2);
            exercise3.setText(ex3);
            exercise4.setText(ex4);
            exerciseInt.setText(exInt);
            setsInt.setText(setInt);
            restInt.setText(rstInt);
            exerciseHard.setText(exHard);
            setsHard.setText(setHard);
            restHard.setText(rstHard);
            hardList.add(ex1);
            hardList.add(ex2);
            hardList.add(ex3);
            hardList.add(ex4);
            hardList.add(exInt);
            hardList.add(exHard);
            String hardString = TextUtils.join(",", hardList);
            myEditorPicHard.putString("programImage", imageArray[0] = hardString).apply();
            PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putString("programImage", imageArray[0]).apply();
        }

        Button sv = findViewById(R.id.sv);
        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){
                    Toast.makeText(getApplicationContext(), "Select a workout program :)", Toast.LENGTH_SHORT).show();
                }else{
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s1", String.valueOf(0));
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r1", String.valueOf(0));
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e1", String.valueOf(0));

                    exercise1.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e1", String.valueOf(0)));
                    exercise2.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e2", String.valueOf(0)));
                    exercise3.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e3", String.valueOf(0)));
                    exercise4.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e4", String.valueOf(0)));

                    sets1.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s1", String.valueOf(0)));
                    sets2.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s2", String.valueOf(0)));
                    sets3.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s3", String.valueOf(0)));
                    sets4.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s4", String.valueOf(0)));

                    rest1.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r1", String.valueOf(0)));
                    rest2.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r2", String.valueOf(0)));
                    rest3.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r3", String.valueOf(0)));
                    rest4.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r4", String.valueOf(0)));

                    exerciseInt.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e5", String.valueOf(0)));
                    setsInt.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s5", String.valueOf(0)));
                    restInt.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r5", String.valueOf(0)));

                    exerciseHard.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("e6", String.valueOf(0)));
                    setsHard.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("s6", String.valueOf(0)));
                    restHard.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("r6", String.valueOf(0)));


                }

            }
        });

    }


    public void crossActivityDataTrackers(){

        final int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final String numIndicator = Integer.toString(programIndicator);
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int []count = {myPrefs.getInt("num",0)};
        final int []currentLevel = {myPrefs.getInt("num2",0)};
        final int [] points = {myPrefs.getInt("num3",1)};;
        final int [] giveUpPoints = {myPrefs.getInt("num4", 0)};

        temp  = Integer.toString(count[0]);
        setContentView(R.layout.activity_workout_tab);
        Button btn = findViewById(R.id.btn1);
        Button easyBtn = findViewById(R.id.easy);

        Button giveUp = findViewById(R.id.giveUp);
        giveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){
                    Toast.makeText(getApplicationContext(), "Select a workout program :)", Toast.LENGTH_SHORT).show();
                }else{
                    myEditor.putInt("num4", giveUpPoints[0]++).apply();
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num4", giveUpPoints[0]).apply();
                    displayWorkouts();

                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor myEditor = myPrefs.edit();
                if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){
                    Toast.makeText(getApplicationContext(), "Select a workout program :)", Toast.LENGTH_SHORT).show();
                }else{

                    myEditor.putInt("num", count[0]++).apply();
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num", count[0]).apply();

                    if(count[0] == points[0] * 2){
                        myEditor.putInt("num2", currentLevel[0]++).apply();
                        myEditor.putInt("num3", points[0] = count[0]).apply();
                        PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num2", currentLevel[0]).apply();
                    }

                    temp = Integer.toString(count[0]);
                    temp2 = Integer.toString(currentLevel[0]);
                    displayWorkouts();
                }
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tab);

        crossActivityDataTrackers();

        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final boolean[] choiceEasy = {myPrefs.getBoolean("easy", false)};
        final boolean[] choiceInt = {myPrefs.getBoolean("intermediate", false)};;
        final boolean[] choiceHard = {myPrefs.getBoolean("hard", false)};
        final SharedPreferences.Editor myEditor = myPrefs.edit();
        final TextView pro = findViewById(R.id.pro);
        final int programI = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum", 0);
        final String numIndicator = Integer.toString(programI);

        Button easyBtn = findViewById(R.id.easy);
        Button intBtn = findViewById(R.id.intermediate);
        Button hardBtn = findViewById(R.id.hard);

        TextView exercise1 = findViewById(R.id.ex1);
        TextView exercise2 = findViewById(R.id.ex2);
        TextView exercise3 = findViewById(R.id.ex3);
        TextView exercise4 = findViewById(R.id.ex4);
        TextView exerciseInt = findViewById(R.id.exInt);

        TextView sets1 = findViewById(R.id.sets1);
        TextView sets2 = findViewById(R.id.sets2);
        TextView sets3 = findViewById(R.id.sets3);
        TextView sets4 = findViewById(R.id.sets4);

        TextView rest1 = findViewById(R.id.rest1);
        TextView rest2 = findViewById(R.id.rest2);
        TextView rest3 = findViewById(R.id.rest3);
        TextView rest4 = findViewById(R.id.rest4);

        easyBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor myEditorPicEasy = myPrefs.edit();
                myEditor.putBoolean("easy",choiceEasy[0] = true).apply();
                myEditor.putBoolean("intermediate",choiceInt[0] = false).apply();
                myEditor.putBoolean("hard",choiceHard[0] = false).apply();
            }
        });

        intBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor myEditorPicInt = myPrefs.edit();
                myEditor.putBoolean("easy",choiceEasy[0] = true).apply();
                myEditor.putBoolean("intermediate",choiceInt[0] = true).apply();
                myEditor.putBoolean("hard",choiceHard[0] = false).apply();
            }
        });

        hardBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor myEditorPicHard = myPrefs.edit();
                myEditor.putBoolean("easy",choiceEasy[0] = true).apply();
                myEditor.putBoolean("intermediate",choiceInt[0] = true).apply();
                myEditor.putBoolean("hard",choiceHard[0] = true).apply();

            }
        });

        /*
        The program indicator variable tells you which workout program the user picked from the selection tab
        if program indicator is equal to 1 then the user wants a weight training program, 2 means the user wants a body weight exercise program, and
        3 means they want a cardio execrise program
         */
        if(programI == 1){
            pro.setText("weight training");
            displayWorkouts();
        }
        if(programI == 2){
            pro.setText("body weight training");
            displayWorkouts();

        }
        if(programI == 3){
            pro.setText("cardio");
            displayWorkouts();
        }

        if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){

            exercise1.setText("");
            exercise2.setText("");
            exercise3.setText("");
            exercise4.setText("");

            sets1.setText("");
            sets2.setText("");
            sets3.setText("");
            sets4.setText("");

            rest1.setText("");
            rest2.setText("");
            rest3.setText("");
            rest4.setText("");
        }

    }

}