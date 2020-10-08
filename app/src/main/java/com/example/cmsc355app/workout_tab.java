package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class workout_tab extends AppCompatActivity {



    String temp = "";
    String temp2 = "";


    public void test(){
        //final SharedPreferences myPrefs = getSharedPreferences("tag", 0);
        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int []count = {myPrefs.getInt("num",0)};
        final int []currentLevel = {myPrefs.getInt("num2",0)};
        final int [] points = {myPrefs.getInt("num3",1)};;

        //final String[] temp = {""};

        temp  = Integer.toString(count[0]);
        setContentView(R.layout.activity_workout_tab);
        Button btn = (Button) findViewById(R.id.btn1);
        //myEditor.putInt("num", count[0]++).commit();

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                SharedPreferences.Editor myEditor = myPrefs.edit();

                //TextView textView2 = (TextView) findViewById(R.id.textView2);
                //TextView textView = (TextView) findViewById(R.id.textView);
                myEditor.putInt("num", count[0]++).apply();
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
            }


        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tab);
        //SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        /*
        The program indicator variable tells you which workout program the user picked from the selection tab
        if program indicator is equal to 1 then the user wants a weight training program, 2 means the user wants a body weight exercise program, and
        3 means they want a cardio execrise program
         */
        int programIndicator = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("programNum",0);
        String numIndicator = Integer.toString(programIndicator);
        TextView pro = findViewById(R.id.pro);
        pro.setText(numIndicator);

        test();
    }


}