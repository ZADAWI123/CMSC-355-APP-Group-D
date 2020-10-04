package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionTab extends AppCompatActivity {
    Button cBtn;
    Button wtBtn;
    Button bwBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_tab);
        cBtn = findViewById(R.id.cBtn);
        wtBtn = findViewById(R.id.wtBtn);
        bwBtn = findViewById(R.id.bwBtn);

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