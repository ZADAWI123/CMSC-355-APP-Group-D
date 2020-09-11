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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Button exButton = (Button) findViewById(R.id.exButton);
    exButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            MainActivity obj = new MainActivity();

            EditText numExercises = (EditText)findViewById(R.id.numExercises);
            TextView exList = (TextView) findViewById(R.id.exList);

            int num = Integer.parseInt(numExercises.getText().toString());
            List<String> exStringList = new ArrayList<>();
            ArrayList<String> printList = new ArrayList<String>();

            exStringList.add("Push up");
            exStringList.add("Pull up");
            exStringList.add("bench up");
            exStringList.add("deadlift up");
            exStringList.add("jump up");
            exStringList.add("row up");
            exStringList.add("swim up");
            exStringList.add("hike up");



            printList= (ArrayList<String>) obj.getRandomElement(exStringList,num);
            exList.setText(Arrays.toString(printList.toArray()));

        }
    });
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
}
