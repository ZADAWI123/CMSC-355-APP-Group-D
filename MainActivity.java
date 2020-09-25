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

    chestButton.setOnClickListener(this);
    legButton.setOnClickListener(this);
    backButton.setOnClickListener(this);

}

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

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.chestButton:
                MainActivity obj = new MainActivity();

                EditText numExercises = (EditText)findViewById(R.id.numExercises);
                TextView exList = (TextView) findViewById(R.id.exList);
                TextView setList = (TextView) findViewById(R.id.numOfReps);

                int num = Integer.parseInt(numExercises.getText().toString());
                List<String> exStringList = new ArrayList<>();
                ArrayList<String> printList = new ArrayList<String>();
                ArrayList<Integer> printSet = new ArrayList<>();

                exStringList.add("Push up");
                exStringList.add("Bench press");
                exStringList.add("incline bench press");
                exStringList.add("incline dumbbell press");
                exStringList.add("flat dumbbell press");
                exStringList.add("decline dumbbell press");
                exStringList.add("chest flies");
                exStringList.add("cable flies");

                printList= (ArrayList<String>) obj.getRandomElement(exStringList,num);
                printSet = (ArrayList<Integer>) obj.getRandomNumber(num);
                exList.setText(Arrays.toString(printList.toArray()));
                setList.setText(Arrays.toString(printSet.toArray()));

                break;
            case R.id.legButton:
                MainActivity obj1 = new MainActivity();

                EditText numExercises1 = (EditText)findViewById(R.id.numExercises);
                TextView exList1 = (TextView) findViewById(R.id.exList);
                TextView setList1 = (TextView) findViewById(R.id.numOfReps);

                int num1 = Integer.parseInt(numExercises1.getText().toString());
                List<String> exStringList1 = new ArrayList<>();
                ArrayList<String> printList1 = new ArrayList<String>();
                ArrayList<Integer> printSet1 = new ArrayList<>();

                exStringList1.add("Jump");
                exStringList1.add("Squats");
                exStringList1.add("Leg Curls");
                exStringList1.add("Leg Extensions");
                exStringList1.add("Jump Squats");
                exStringList1.add("Heavy Squats");
                exStringList1.add("Lounges");
                exStringList1.add("leg Press");

                printList= (ArrayList<String>) obj1.getRandomElement(exStringList1,num1);
                printSet = (ArrayList<Integer>) obj1.getRandomNumber(num1);
                exList1.setText(Arrays.toString(printList.toArray()));
                setList1.setText(Arrays.toString(printSet.toArray()));
                break;
            case R.id.backButton:
                MainActivity obj2 = new MainActivity();

                EditText numExercises2 = (EditText)findViewById(R.id.numExercises);
                TextView exList2 = (TextView) findViewById(R.id.exList);
                TextView setList2 = (TextView) findViewById(R.id.numOfReps);

                int num2 = Integer.parseInt(numExercises2.getText().toString());
                List<String> exStringList2 = new ArrayList<>();
                ArrayList<String> printList2 = new ArrayList<String>();
                ArrayList<Integer> printSet2 = new ArrayList<>();

                exStringList2.add("Pull up");
                exStringList2.add("barbell Row");
                exStringList2.add("deadlift");
                exStringList2.add("lateral pulldown");
                exStringList2.add("dumbell rows");
                exStringList2.add("austrialian pullups");

                printList= (ArrayList<String>) obj2.getRandomElement(exStringList2,num2);
                printSet = (ArrayList<Integer>) obj2.getRandomNumber(num2);
                exList2.setText(Arrays.toString(printList.toArray()));
                setList2.setText(Arrays.toString(printSet.toArray()));
                break;

        }
    }
}
