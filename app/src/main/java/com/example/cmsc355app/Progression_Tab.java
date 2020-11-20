package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Progression_Tab<array> extends AppCompatActivity {

    TextView stringTextView;
    TextView receiver_msg;
    TextView stps;
    TextView totalGoalsComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progression__tab);
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();
        stps = findViewById(R.id.stps);

        receiver_msg = (TextView) findViewById(R.id.calid);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity


        // display the string into textView
        receiver_msg.setText(Float.toString((float) (Math.floor(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getFloat("calCount",  0) * 100) / 100)));
        stps.setText(Integer.toString(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("stepCount", 0)));

        totalGoalsComplete = findViewById(R.id.totalGoalsComplete);
        totalGoalsComplete.setText(Integer.toString(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("complete",0)));

        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        //SharedPreferences.Editor myEditor = myPrefs.edit();
        int level = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("num2",0);
        int numWorkouts = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("num",0);
        int secondLevel = level;
        if(level > 99){
            secondLevel = 99;
        }
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        String temp = Integer.toString(level);
        String temp2 = Integer.toString(numWorkouts);
        textView2.setText(ranks[secondLevel]);
        textView5.setText(temp2);

        //This will display the quit level if you clicked "I Give Up"
        TextView displayQuits = (TextView) findViewById(R.id.displayQuits);
        int quitterRank = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("num4", 0);
        int secondQuitter = quitterRank;
        if(quitterRank > 7){
            secondQuitter = 7;
        }
        final String quitLevel = quitterRanks[secondQuitter];
        displayQuits.setText(quitLevel);

        Button shareBtn = (Button) findViewById(R.id.shareBtn);
        final int finalSecondLevel = secondLevel;
        shareBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri contentUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/" + "ic_launcher");

                String invite = "Think you can beat my rank? Download 'Challenge Me! - Workouts for Beginners' and see who's more dedicated!" +"\n"+"\n"
                        + "https://play.google.com/store/apps/details?id=com.example.cmsc355app" + "\n" + "\n"+ "My rank is: " + ranks[finalSecondLevel];

                if (contentUri != null) {
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    shareIntent.setType("image/*");
                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, invite);
                    shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                    try {
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

            }

    int xp = 0;


    String [] ranks = {"I", "II", "III", "IV", "V", "VI", "VII", "IX", "X","XI", "XII", "XIII",
                       "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
                       "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                       "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                       "XLI", "XLII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                       "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                       "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                       "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                       "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LLXXXIV", "LXXXV", "LXXXVI",
                       "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV",
                       "Pablo Liftabar", "Admiral Squatbar", "Hero", "Legend", "Inheritor"};

    String [] quitterRanks = {"Yay, I'm not a quitter!","Quitter", "So bad, I did it twice",
                              "Third time's a charm, but I'm still a quitter", "n00b",
                              "Sir Quits-a-Lot", "Weenie Hut Jr.", "Weenie Hut General"};

}