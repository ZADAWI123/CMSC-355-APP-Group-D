package com.example.cmsc355app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selection_Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_selection_tab);

        Button cBtn = findViewById(R.id.cBtn);
        Button wtBtn = findViewById(R.id.wtBtn);
        Button bwBtn = findViewById(R.id.bwBtn);

        wtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create value to hold selection
            }
        });

        bwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openworkout_tab();
                //Create value to hold selection
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openworkout_tab();
                //Create value to hold selection
            }
        });
    }

}