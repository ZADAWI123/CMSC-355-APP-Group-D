/* This is the tab that allows the user to select bodyweight, weight lifting or cardio exercise*/
package com.example.cmsc355app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Selection_Tab extends AppCompatActivity {

    private Button cBtn;
    private Button wlBtn;
    private Button bwBtn;

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_selection_tab);

        cBtn = findViewById(R.id.cBtn);
        wlBtn = findViewById(R.id.wlBtn);
        cBtn = findViewById(R.id.bwBtn);
    }

}
