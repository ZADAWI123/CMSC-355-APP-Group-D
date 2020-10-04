/*
This activity is the main hub of the app that contains buttons that lead to all the other
sections of the app.
 */
package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;

public class main_hub extends AppCompatActivity {

    private Button BtnWork;
    private Button BtnPro;
    private Button BtnSel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);

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
}