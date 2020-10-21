package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//Testing gradle thing
public class workout_tab extends AppCompatActivity {
    private Chronometer stopwatch;
    private boolean running;

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
    //    public class timer{
//        Timer timer = new Timer();
//        TimerTask task = new helpTime();
//        timer.schedule(task, 2000, 5000);
//    }
//    class helpTime extends TimerTask
//    {
//        public int i = 0;
//        public void run()
//    }
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
    public void displayWorkouts(){
        final int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final String numIndicator = Integer.toString(programIndicator);

       // switch (v.getId()) {

            //case R.id.giveUp:
                TextView exList = (TextView) findViewById(R.id.exList);
                TextView setList = (TextView) findViewById(R.id.numOfReps);
                TextView restAmount = (TextView) findViewById(R.id.restAmount);


            TextView exercise1 = (TextView) findViewById(R.id.ex1);
            TextView exercise2 = (TextView) findViewById(R.id.ex2);
            TextView exercise3 = (TextView) findViewById(R.id.ex3);
            TextView exercise4 = (TextView) findViewById(R.id.ex4);

            TextView sets1 = (TextView) findViewById(R.id.sets1);
            TextView sets2 = (TextView) findViewById(R.id.sets2);
            TextView sets3 = (TextView) findViewById(R.id.sets3);
            TextView sets4 = (TextView) findViewById(R.id.sets4);

            TextView rest1 = (TextView) findViewById(R.id.rest1);
            TextView rest2 = (TextView) findViewById(R.id.rest2);
            TextView rest3 = (TextView) findViewById(R.id.rest3);
            TextView rest4 = (TextView) findViewById(R.id.rest4);

                int num = 4;
                List<String> weightList = new ArrayList<>();
                List<String> bodyweightList = new ArrayList<>();
                List<String> cardioList = new ArrayList<>();
                List<String> restList = new ArrayList<>();
                ArrayList<String> printList = new ArrayList<String>();
                ArrayList<Integer> printSet = new ArrayList<>();
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

                restList.add("rest for 30 secs");
                restList.add("rest for 1 minute");
                restList.add("rest for 2 minutes");
                restList.add("rest for 3 minutes");


                if(programIndicator == 1){
                    printList= (ArrayList<String>)getRandomElement(weightList,num);
                    printSet = (ArrayList<Integer>)getRandomNumber(num);
                    printRestSet=(ArrayList<String>)getRandomElement(restList,num);

                }
                if(programIndicator == 2){
                    printList= (ArrayList<String>)getRandomElement(bodyweightList,num);
                    printSet = (ArrayList<Integer>)getRandomNumber(num);
                    printRestSet=(ArrayList<String>)getRandomElement(restList,num);

                }
                if(programIndicator == 3){
                    printList= (ArrayList<String>)getRandomElement(cardioList,num);
                    printSet = (ArrayList<Integer>)getRandomNumber(num);
                    printRestSet=(ArrayList<String>)getRandomElement(restList,num);



                }




                //printList= (ArrayList<String>)getRandomElement(weightList,num);

                String ex1 = printList.get(0);
                String ex2 = printList.get(1);
                String ex3 = printList.get(2);
                String ex4 = printList.get(3);
                exercise1.setText(ex1);
                exercise2.setText(ex2);
                exercise3.setText(ex3);
                exercise4.setText(ex4);

                String set1 = Integer.toString(printSet.get(0)) + " reps";
                String set2 = Integer.toString(printSet.get(1)) + " reps";
                String set3 = Integer.toString(printSet.get(2)) + " reps";
                String set4 = Integer.toString(printSet.get(3)) + " reps";
                sets1.setText(set1);
                sets2.setText(set2);
                sets3.setText(set3);
                sets4.setText(set4);

                String rst1 = printRestSet.get(0);
                String rst2 = printRestSet.get(1);
                String rst3 = printRestSet.get(2);
                String rst4 = printRestSet.get(3);
                rest1.setText(rst1);
                rest2.setText(rst2);
                rest3.setText(rst3);
                rest4.setText(rst4);







                exList.setText("");
                setList.setText("");
                restAmount.setText("");
                //restAmount.setText(Arrays.toString(printRestSet.toArray()));


               // break;
       // }
    }


    public void test(){
        final int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final String numIndicator = Integer.toString(programIndicator);
        //final SharedPreferences myPrefs = getSharedPreferences("tag", 0);
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int []count = {myPrefs.getInt("num",0)};
        final int []currentLevel = {myPrefs.getInt("num2",0)};
        final int [] points = {myPrefs.getInt("num3",1)};;
        final int [] giveUpPoints = {myPrefs.getInt("num4", 0)};

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
                displayWorkouts();



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
                displayWorkouts();


            }





        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tab);
        stopwatch = findViewById(R.id.stopwatch);
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
        final TextView pro = findViewById(R.id.pro);
        final int programI = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        final String numIndicator = Integer.toString(programI);



        if(programI == 1){
            pro.setText("weight training");
            displayWorkouts();
        }
        if(programI == 2){
            pro.setText("body weight training");
            displayWorkouts();

        }
        if(programI== 3){
            pro.setText("cardio");
            displayWorkouts();
        }
        if(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0) == 0){
            TextView exList = (TextView) findViewById(R.id.exList);
            TextView setList = (TextView) findViewById(R.id.numOfReps);
            TextView restAmount = (TextView) findViewById(R.id.restAmount);
            exList.setText("You can't work out if you haven't chosen a workout program!");
            setList.setText("");
            restAmount.setText("");
        }





    }
    public void startwatch(View v){
        if(!running){
            stopwatch.start();
            running = true;
        }
    }
    public void pauseWatch(View v){
        if(running){
            stopwatch.stop();
            running = false;
        }
    }
    public void resetWatch(View v){
        if(!running){
            stopwatch.start();
            running = true;
        }
    }

}