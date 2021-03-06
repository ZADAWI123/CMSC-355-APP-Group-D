package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectionTab extends AppCompatActivity {
    Button cBtn;
    Button wtBtn;
    Button bwBtn;

    private Button weight;
    private Button body;
    private Button cardio;
    private Button facts;

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
                Toast.makeText(getApplicationContext(), "Workout program set!", Toast.LENGTH_SHORT).show();
                //Create value to hold selection
            }
        });

        bwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("programNum", whichProgram[0]=2).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("programNum", whichProgram[0]).apply();
                Toast.makeText(getApplicationContext(), "Workout program set!", Toast.LENGTH_SHORT).show();
                //Create value to hold selection
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myPrefs.edit();
                myEditor.putInt("programNum", whichProgram[0]=3).apply();
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().putInt("programNum", whichProgram[0]).apply();
                Toast.makeText(getApplicationContext(), "Workout program set!", Toast.LENGTH_SHORT).show();

                //Create value to hold selection
            }
        });

        facts = findViewById(R.id.factBtn);
        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToFact();
            }
        });

    }

    private void moveToWeightList(){
        Intent intent10 = new Intent(SelectionTab.this, weightList.class);
        startActivity(intent10);
    }
    private void moveToBodyList(){
        Intent intent11 = new Intent(SelectionTab.this, bodyList.class);
        startActivity(intent11);
    }
    private void moveToCardioList(){
        Intent intent12 = new Intent(SelectionTab.this, cardioList.class);
        startActivity(intent12);
    }

    private void moveToFact(){
        Intent intentW = new Intent(SelectionTab.this, randomFacts.class);
        startActivity(intentW);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_tab);
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();
        cBtn = findViewById(R.id.cBtn);
        wtBtn = findViewById(R.id.wtBtn);
        bwBtn = findViewById(R.id.bwBtn);
        selectProgram();

        weight = findViewById(R.id.weightListButton);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToWeightList();
            }
        });

        cardio = findViewById(R.id.cardioListButton);
        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCardioList();
            }
        });

        body = findViewById(R.id.bodyListButton);
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToBodyList();
            }
        });

    }

}