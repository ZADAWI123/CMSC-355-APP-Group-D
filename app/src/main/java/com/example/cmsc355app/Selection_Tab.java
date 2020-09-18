package com.example.cmsc355app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selection_Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_selection_tab);

        Button cBtn = findViewById(R.id.cBtn);
        Button wlBtn = findViewById(R.id.wlBtn);
        Button bwBtn = findViewById(R.id.bwBtn);
    }
}
