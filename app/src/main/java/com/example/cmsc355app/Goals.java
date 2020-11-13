package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Goals extends AppCompatActivity {
    private Button setG;
    private EditText goalNum;
    private TextView goal1;
    private TextView goal2;
    private TextView goal3;
    private EditText goalName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4200);
        animationDrawable.setExitFadeDuration(4200);
        animationDrawable.start();

        final SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final String[] gl1 = {myPrefs.getString("goal1", "")};
        final String[] gl2 = {myPrefs.getString("goal2", "")};
        final String[] gl3 = {myPrefs.getString("goal3", "")};
        final SharedPreferences.Editor myEditor = myPrefs.edit();



        goalNum = (EditText)findViewById(R.id.goalNum);
        goal1 = (TextView)findViewById(R.id.goal1);
        goal2 = (TextView)findViewById(R.id.goal2);
        goal3 = (TextView)findViewById(R.id.goal3);
        goalName = (EditText)findViewById(R.id.goalName);

        setG = findViewById(R.id.setG);

        setG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(goalNum.getText().toString().equals("1")){
                    myEditor.putString("goal1",gl1[0] = goalName.getText().toString()).apply();
                    goal1.setText(goalName.getText());
                }else if(goalNum.getText().toString().equals("2")){
                    myEditor.putString("goal2",gl2[0] = goalName.getText().toString()).apply();
                    goal2.setText(goalName.getText());
                }else if(goalNum.getText().toString().equals("3")){
                    myEditor.putString("goal3",gl3[0] = goalName.getText().toString()).apply();
                    goal3.setText(goalName.getText());
                }
                System.out.println( goalNum.getText());
            }
        });
        goal1.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("goal1",""));
        goal2.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("goal2",""));
        goal3.setText(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("goal3",""));
    }
}