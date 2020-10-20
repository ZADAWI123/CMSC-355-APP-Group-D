/*
This activity is the main hub of the app that contains buttons that lead to all the other
sections of the app.
 */
package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class main_hub extends AppCompatActivity {

    private Button BtnWork;
    private Button BtnPro;
    private Button BtnSel;
    private Button BtnExa;
    private TextView textView;
    private double MagnitudePrevious = 0;
    private Integer stCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);

        textView = findViewById(R.id.textView3);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);

        //This will track your phone and count how many steps you will take.
        SensorEventListener stepDetector = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {

                if (sensorEvent != null) {
                    float x_acceleration = sensorEvent.values[0];
                    float y_acceleration = sensorEvent.values[1];
                    float z_acceleration = sensorEvent.values[2];
                    double Magnitude = Math.sqrt(x_acceleration * x_acceleration + y_acceleration * y_acceleration + z_acceleration * z_acceleration);
                    double MagnitudeDelta = Magnitude - MagnitudePrevious;
                    MagnitudePrevious = Magnitude;

                    if (MagnitudeDelta > 5) {
                        stCount++;
                    }

                    //This is were it will display your steps.
                    textView.setText("Steps: " + stCount.toString());
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

        sensorManager.registerListener(stepDetector, sensor, SensorManager.SENSOR_DELAY_NORMAL);


        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //Workout Button
        BtnWork = findViewById(R.id.workOutBtn);

        BtnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToWorkOut();
            }
        });

        //Progression Button
        BtnPro = findViewById(R.id.progressBtn);

        BtnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToProgress();
            }
        });

        BtnSel = (Button)findViewById(R.id.selectBtn);

        BtnSel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSelection();
            }
        });

        BtnExa = (Button)findViewById(R.id.examplesBtn);

        BtnExa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToExample();
            }
        });
    }

    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.putInt("Stepcount", stCount);
        editor.apply();
    }

    protected void onStop() {
        super.onStop();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.putInt("stepCount", stCount);
        editor.apply();
    }

    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        stCount = sharedPreferences.getInt("stepCount", 0);
    }


    private void moveToWorkOut(){

        Intent intent1 = new Intent(main_hub.this, workout_tab.class);
        startActivity(intent1);
    }
    private void moveToProgress(){

        Intent intent2 = new Intent(main_hub.this, Progression_Tab.class);
        startActivity(intent2);
    }

    private void moveToSelection(){
        Intent intentS = new Intent(main_hub.this, SelectionTab.class);
        startActivity(intentS);
    }

    private void moveToExample(){
        Intent intent3 = new Intent(main_hub.this, workExamples.class);
        startActivity(intent3);
    }

}