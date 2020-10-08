package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class SelectionTab extends AppCompatActivity {
    Button cBtn;
    Button wtBtn;
    Button bwBtn;
    String workoutValue;
    /*This method stores the value of each button click and allows the value to be carried over between
      activities, 1 means you want weight training, 2 means you want a body weight exercise program, and
      3 means you want a cardio execrise program. These values will be passed to the workout tab through
      shared preferences and those values will be used to display the according randomized workout program
     */

    public void selectProgram(){
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int [] whichProgram = {myPrefs.getInt("programNum",0)};

        wtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("programNum", whichProgram[0]=1).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("programNum", whichProgram[0]).apply();
                //Create value to hold selection
            }
        });

        bwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("programNum", whichProgram[0]=2).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("programNum", whichProgram[0]).apply();
                //Create value to hold selection
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("programNum", whichProgram[0]=3).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("programNum", whichProgram[0]).apply();

                //Create value to hold selection
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_tab);
        cBtn = findViewById(R.id.cBtn);
        wtBtn = findViewById(R.id.wtBtn);
        bwBtn = findViewById(R.id.bwBtn);
        selectProgram();


    }
}