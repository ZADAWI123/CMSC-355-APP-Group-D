package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
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
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        goalNum = (EditText)findViewById(R.id.goalNum);
        goal1 = findViewById(R.id.goal1);
        goal2 = findViewById(R.id.goal2);
        goal3 = findViewById(R.id.goal3);
        goalName = (EditText)findViewById(R.id.goalName);

        setG = findViewById(R.id.setG);

        setG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(goalNum.getText().equals("1")){
                    goal1.setText(goalName.getText());
                }else if(goalNum.getText().equals("2")){
                    goal2.setText(goalName.getText());
                }else if(goalNum.getText().equals("3")){
                    goal3.setText(goalName.getText());
                }else{

                }
            }
        });
    }
}