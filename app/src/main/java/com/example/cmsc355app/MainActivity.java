package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //This is the name of the button
    private Button BtnMove;

    TextView stringTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringTextView = (TextView)findViewById(R.id.randomQuotes);

        List<String> list = new ArrayList<>();

        list.add("You are a Machine");
        list.add("You can do this!");
        list.add("It all starts with you.");
        list.add("Your limitation—it's only your imagination.");
        list.add("Sometimes later becomes never.");

        MainActivity obj = new MainActivity();

        stringTextView.setText(stringTextView.getText() + getRandomQuote(list));


        //Below is the code for the button
        BtnMove = findViewById(R.id.toHub);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToHubMain();
            }
        });

    }

    //This the random code
    public String getRandomQuote(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    //This is the button code
    private void moveToHubMain(){

        Intent intent = new Intent(MainActivity.this, main_hub.class);
        startActivity(intent);
    }
}