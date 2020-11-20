package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class WarningActivity extends AppCompatActivity {

    private Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);

        continueBtn = (Button)findViewById(R.id.conBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToContinue();
            }
        });
    }
    private void moveToContinue(){
        Intent intentW = new Intent(WarningActivity.this, challenges.class);
        startActivity(intentW);
    }
}