package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
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
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();
        stringTextView = findViewById(R.id.randomQuotes);

        //List<String> list = new ArrayList<>();

        String[] array = {"You are a Machine", "You can do this!", "It all starts with you.", "Your limitation—it's only your imagination.",
                "Sometimes later becomes never.", "No pain, no gain. Shut up and train.", "Train insane or remain the same.",
                "Push yourself because no one else is going to do it for you.", "Suck it up. And one day you won’t have to suck it in.",
                "Success starts with self-discipline.", "Good things come to those who sweat.", "The body achieves what the mind believes.",
                "Someone busier than you is working out right now.", "The hardest lift of all is lifting your butt off the couch."};

        List<String> list = Arrays.asList(array);

        MainActivity obj = new MainActivity();

        stringTextView.setText(stringTextView.getText() + getRandomQuote(list));


        //Below is the code for the button
        BtnMove = findViewById(R.id.toHubBtn);

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