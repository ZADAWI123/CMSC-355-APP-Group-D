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
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;

public class main_hub extends AppCompatActivity {

    private Button BtnWork;
    private Button BtnPro;
    private Button BtnSel;
    private Button BtnExa;
    private Button BtnReset;
    private TextView stepTxt;
    private Button goalTab;
    private Button help;
    private Button warning;

    private double MagnitudePrevious = 0;
    private TextView calCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);

        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final SharedPreferences.Editor myEditor = myPrefs.edit();
        final int[] stepCount = {myPrefs.getInt("stepCount", 0)};
        final float[] calorieCount = {myPrefs.getFloat("calCount", 0)};

        final int[] stepCount2 = {myPrefs.getInt("stepCount2", 0)};
        final float[] calorieCount2 = {myPrefs.getFloat("calCount2", 0)};

        stepTxt = findViewById(R.id.textView3);
        calCountText = findViewById(R.id.calCountText);
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

                        myEditor.putInt("stepCount2", stepCount2[0]+=1).apply();


                        myEditor.putFloat("calCount2", calorieCount2[0]+=(float)0.04).apply();

                        myEditor.putInt("stepCount", stepCount[0]+=1).apply();
                        myEditor.putInt("points", PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("points",0)+1).apply();
                        myEditor.putFloat("calCount", calorieCount[0]+=(float)0.04).apply();
                        //myEditor.putInt("calCount", calorieCount[0]++).apply();
                    }

                    //This is were it will display your steps.
                    stepTxt.setText("Steps: " + Integer.toString(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("stepCount2", 0)));
                    calCountText.setText("Calories: " + Float.toString((float) (Math.floor(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getFloat("calCount2",  0) * 100) / 100)));


                }
            }


            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

        sensorManager.registerListener(stepDetector, sensor, SensorManager.SENSOR_DELAY_NORMAL);


        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();

        //Workout Button
        BtnWork = findViewById(R.id.workOutBtn);

        BtnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToWorkOut();
            }
        });

        BtnReset = findViewById(R.id.resetBtn);

        BtnReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    myEditor.putInt("stepCount2", stepCount2[0] = 0).apply();
                    myEditor.putFloat("calCount2", calorieCount2[0] = 0).apply();

                    stepTxt.setText("Steps: " + Integer.toString(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("stepCount2", 0)));
                    calCountText.setText("Calories: " + Float.toString(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getFloat("calCount2",  0)));


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
        goalTab = (Button)findViewById(R.id.goalTab);
        goalTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGoals();
            }
        });


        help = (Button)findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToHelp();
            }
        });

        warning = (Button)findViewById(R.id.challenges);
        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToWarning();
            }
        });

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

    private void moveToGoals(){
        Intent intentG = new Intent(main_hub.this, Goals.class);
        startActivity(intentG);
    }
    private void moveToHelp(){
        Intent intentH = new Intent(main_hub.this, help.class);
        startActivity(intentH);
    }

    private void moveToWarning(){
        Intent intentW = new Intent(main_hub.this, WarningActivity.class);
        startActivity(intentW);
    }


}