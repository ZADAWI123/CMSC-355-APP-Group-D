package com.example.workoutishapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button chestButton = findViewById(R.id.chestButton);
    Button legButton = findViewById(R.id.legButton);
    Button backButton = findViewById(R.id.backButton);
    Button heavy= findViewById(R.id.buttonHeavy);
    Button light= findViewById(R.id.buttonLight);
    Button bb= findViewById(R.id.buttonBodybuilding);

    chestButton.setOnClickListener(this);
    legButton.setOnClickListener(this);
    backButton.setOnClickListener(this);


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
    /*
    random set number generator that will be used later
    based on heaby, light, or size input the number of reps will change
     */
    public List<Integer> randomSetNum(int num){
        Random randNum = new Random();
        int n = 1;
        List<Integer> numList = new ArrayList<>(n);
        return numList;
    }
    public List<String> randomRepPattern (int num){
        Random randPattern = new Random();
        int n = num;
        List<String> comboList = new ArrayList<>();
        comboList.add("pyramid up");
        comboList.add("pyramid down");
        comboList.add("same amount");
        return comboList;
    }

    public List<String> randomRestAmount (int num){
        Random ranCombo = new Random();
        int n = num;
        List<String> comboList = new ArrayList<>();
        comboList.add("2 minutes");
        comboList.add("30 seconds");
        comboList.add("5 minutes");
        return comboList;
    }
    /*
    this method returns a random combo set for the user
     */

    public List<String> randomCombination (int num){
        Random ranCombo = new Random();
        int n = num;
        List<String> comboList = new ArrayList<>();
        comboList.add("Back and Biceps");
        comboList.add("Chest and Triceps and Shoulders");
        comboList.add("Legs and abs");
        return comboList;
    }
        /*
    this method returns a random number based on the sets
     */

    public List<Integer> getRandomNumSets(int num){
        Random randNum = new Random();
        int n = num;
        int RandomInt = randNum.nextInt(3);
        List<Integer> numSet = new ArrayList<>(n);
        for (int i = 1; i <= num; i++){
            numSet.add(RandomInt + 3);
        }
        return numSet;
    }
/*
this method returns the exercises with the number of sets to do
later i plan to change the sets based on power, size, or athetic endurance
 */
    @Override
    public void onClick(View view) {
        //MainActivity obj = new MainActivity();
        switch (view.getId())
        {
            //MainActivity obj = new MainActivity();
            case R.id.chestButton:
                //MainActivity obj = new MainActivity();

                EditText numExercises = (EditText)findViewById(R.id.numExercises);
                TextView exList = (TextView) findViewById(R.id.exList);
                TextView setList = (TextView) findViewById(R.id.numOfReps);

                int num = Integer.parseInt(numExercises.getText().toString());
                List<String> exStringList = new ArrayList<>();
                ArrayList<String> printList = new ArrayList<String>();
                ArrayList<Integer> printSet = new ArrayList<>();
                //chest exercises
                exStringList.add("Push up");
                exStringList.add("Bench press");
                exStringList.add("incline bench press");
                exStringList.add("incline dumbbell press");
                exStringList.add("flat dumbbell press");
                exStringList.add("decline dumbbell press");
                exStringList.add("chest flies");
                exStringList.add("cable flies");

                printList= (ArrayList<String>)getRandomElement(exStringList,num);
                printSet = (ArrayList<Integer>)getRandomNumber(num);
                exList.setText(Arrays.toString(printList.toArray()));
                setList.setText(Arrays.toString(printSet.toArray()));

                break;
            case R.id.legButton:
                //MainActivity obj = new MainActivity();

                EditText numExercises1 = (EditText)findViewById(R.id.numExercises);
                TextView exList1 = (TextView) findViewById(R.id.exList);
                TextView setList1 = (TextView) findViewById(R.id.numOfReps);

                int num1 = Integer.parseInt(numExercises1.getText().toString());
                List<String> exStringList1 = new ArrayList<>();
                //leg exercises
                exStringList1.add("Jump");
                exStringList1.add("Squats");
                exStringList1.add("Leg Curls");
                exStringList1.add("Leg Extensions");
                exStringList1.add("Jump Squats");
                exStringList1.add("Heavy Squats");
                exStringList1.add("Lounges");
                exStringList1.add("leg Press");

                printList= (ArrayList<String>)getRandomElement(exStringList1,num1);
                printSet = (ArrayList<Integer>)getRandomNumber(num1);
                exList1.setText(Arrays.toString(printList.toArray()));
                setList1.setText(Arrays.toString(printSet.toArray()));
                break;
            case R.id.backButton:
                //MainActivity obj2 = new MainActivity();

                EditText numExercises2 = (EditText)findViewById(R.id.numExercises);
                TextView exList2 = (TextView) findViewById(R.id.exList);
                TextView setList2 = (TextView) findViewById(R.id.numOfReps);

                int num2 = Integer.parseInt(numExercises2.getText().toString());
                List<String> exStringList2 = new ArrayList<>();
                ArrayList<String> printList2 = new ArrayList<String>();
                ArrayList<Integer> printSet2 = new ArrayList<>();
                //back exercises
                exStringList2.add("Pull up");
                exStringList2.add("barbell Row");
                exStringList2.add("deadlift");
                exStringList2.add("lateral pulldown");
                exStringList2.add("dumbell rows");
                exStringList2.add("austrialian pullups");

                printList= (ArrayList<String>)getRandomElement(exStringList2,num2);
                printSet = (ArrayList<Integer>)getRandomNumber(num2);
                exList2.setText(Arrays.toString(printList.toArray()));
                setList2.setText(Arrays.toString(printSet.toArray()));
                break;
                /*
                case R.id.bicepButton:
                MainActivity obj2 = new MainActivity();

                EditText numExercises2 = (EditText)findViewById(R.id.numExercises);
                TextView exList2 = (TextView) findViewById(R.id.exList);
                TextView setList2 = (TextView) findViewById(R.id.numOfReps);

                int num2 = Integer.parseInt(numExercises2.getText().toString());
                List<String> exStringList2 = new ArrayList<>();
                ArrayList<String> printList2 = new ArrayList<String>();
                ArrayList<Integer> printSet2 = new ArrayList<>();
                //back exercises
                exStringList2.add("curl up");
                exStringList2.add("chin up");
                exStringList2.add("cable pulls");
                exStringList2.add("preacher curls");


                printList= (ArrayList<String>) obj2.getRandomElement(exStringList2,num2);
                printSet = (ArrayList<Integer>) obj2.getRandomNumber(num2);
                exList2.setText(Arrays.toString(printList.toArray()));
                setList2.setText(Arrays.toString(printSet.toArray()));
                break;

                case R.id.cardioButton:
                MainActivity obj2 = new MainActivity();

                EditText numExercises2 = (EditText)findViewById(R.id.numExercises);
                TextView exList2 = (TextView) findViewById(R.id.exList);
                TextView setList2 = (TextView) findViewById(R.id.numOfReps);

                int num2 = Integer.parseInt(numExercises2.getText().toString());
                List<String> exStringList2 = new ArrayList<>();
                ArrayList<String> printList2 = new ArrayList<String>();
                ArrayList<Integer> printSet2 = new ArrayList<>();
                //back exercises
                exStringList2.add("1 mile run");
                exStringList2.add("100 yard sprints");
                exStringList2.add("cycling");
                exStringList2.add("swimming");
                exStringList2.add("jump rope");

                printList= (ArrayList<String>) obj2.getRandomElement(exStringList2,num2);
                printSet = (ArrayList<Integer>) obj2.getRandomNumber(num2);
                exList2.setText(Arrays.toString(printList.toArray()));
                setList2.setText(Arrays.toString(printSet.toArray()));
                break;
                 */

        }

        TextView repList = (TextView) findViewById(R.id.amountOfRest);
    }
}
