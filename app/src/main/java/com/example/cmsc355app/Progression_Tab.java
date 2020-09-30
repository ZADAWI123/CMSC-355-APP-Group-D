package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Progression_Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progression__tab);
        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        //SharedPreferences.Editor myEditor = myPrefs.edit();
        int level = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("num2",1);
        int numWorkouts = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("num",0);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        String temp = Integer.toString(level);
        String temp2 = Integer.toString(numWorkouts);
        textView2.setText(ranks[level]);
        textView5.setText(temp2);
         /*
        Button shareBtn = (Button) findViewById(R.id.shareBtn);
        shareBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String invite = "Think you can beat my rank? Download 'Challenge Me! - Workouts for Beginners' and see who's more dedicated!";
                String link = "https://play.google.com/store/apps/details?id=com.example.cmsc355app";

        Button shareBtn = (Button) findViewById(R.id.shareBtn);
        shareBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri contentUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/" + "ic_launcher");

                String invite = "Think you can beat my rank? Download 'Challenge Me! - Workouts for Beginners' and see who's more dedicated!";
                String link = "https://play.google.com/store/apps/details?id=com.example.cmsc355app";

                if (contentUri != null) {
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, invite);
                    shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                    try {
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getApplicationContext(), "No App Available", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



            }

        });

         */

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
}