package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Progression_Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progression__tab);
        SharedPreferences myPrefs = getSharedPreferences("tag", 0);
        SharedPreferences.Editor myEditor = myPrefs.edit();
        int level = myPrefs.getInt("check", 0);
        PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("check", "num2");

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