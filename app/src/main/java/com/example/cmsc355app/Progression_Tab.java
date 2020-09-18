package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

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