package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
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

    String temp = "";
    String temp2 = "";


    public void test(){
        final int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final String numIndicator = Integer.toString(programIndicator);
        //final SharedPreferences myPrefs = getSharedPreferences("tag", 0);
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int []count = {myPrefs.getInt("num",0)};
        final int []currentLevel = {myPrefs.getInt("num2",0)};
        final int [] points = {myPrefs.getInt("num3",1)};;
        final int [] giveUpPoints = {myPrefs.getInt("num4", 0)};
        TextView pro = findViewById(R.id.pro);

        if(programIndicator == 1){
            pro.setText("weight training");
        }
        if(programIndicator == 2){
            pro.setText("body weight training");
        }
        if(programIndicator == 3){
            pro.setText("cardio");
        }

        //final String[] temp = {""};

        temp  = Integer.toString(count[0]);
        setContentView(R.layout.activity_workout_tab);
        Button btn = (Button) findViewById(R.id.btn1);
        //myEditor.putInt("num", count[0]++).commit();
        Button giveUp = (Button)findViewById(R.id.giveUp);
        giveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("num4", giveUpPoints[0]++).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num4", giveUpPoints[0]).apply();

                switch (v.getId()) {

                    case R.id.giveUp:
                        TextView exList = (TextView) findViewById(R.id.exList);
                        TextView setList = (TextView) findViewById(R.id.numOfReps);

                        int num = 4;
                        List<String> weightList = new ArrayList<>();
                        List<String> bodyweightList = new ArrayList<>();
                        List<String> cardioList = new ArrayList<>();
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

                        if(programIndicator == 1){
                            printList= (ArrayList<String>)getRandomElement(weightList,num);

                        }
                        if(programIndicator == 2){
                            printList= (ArrayList<String>)getRandomElement(bodyweightList,num);

                        }
                        if(programIndicator == 3){
                            printList= (ArrayList<String>)getRandomElement(cardioList,num);



                        }



                        //printList= (ArrayList<String>)getRandomElement(weightList,num);
                        printSet = (ArrayList<Integer>)getRandomNumber(num);
                        exList.setText(Arrays.toString(printList.toArray()));
                        setList.setText(Arrays.toString(printSet.toArray()));


                        break;
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                SharedPreferences.Editor myEditor = myPrefs.edit();

                //TextView textView2 = (TextView) findViewById(R.id.textView2);
                //TextView textView = (TextView) findViewById(R.id.textView);
                myEditor.putInt("num", count[0]++).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num", count[0]).apply();

                if(count[0] == points[0] * 2){
                    myEditor.putInt("num2", currentLevel[0]++).apply();
                    myEditor.putInt("num3", points[0] = count[0]).apply();
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num2", currentLevel[0]).apply();
                    PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("num", currentLevel[0]).apply();


                }


                temp = Integer.toString(count[0]);
                temp2 = Integer.toString(currentLevel[0]);
                //textView2.setText(temp);
                //textView.setText(temp2);

            }




        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tab);
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        //SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        /*
        The program indicator variable tells you which workout program the user picked from the selection tab
        if program indicator is equal to 1 then the user wants a weight training program, 2 means the user wants a body weight exercise program, and
        3 means they want a cardio execrise program
         */
        test();





    }


}