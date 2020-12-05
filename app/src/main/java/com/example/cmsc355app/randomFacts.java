package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class randomFacts extends AppCompatActivity {

    TextView stringTextView;
    private Button nextFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_facts);
        stringTextView = findViewById(R.id.randomText);

        String[] array = {"Health is a state of physical, mental and\nsocial well-being in which disease and infirmity are absent.",
                "The word 'gymnasium' comes from the Greek word\ngymnazein, which means 'to exercise naked.'",
                "You burn more calories sleeping\nthan you do watching television.", "During your lifetime, you'll eat\nabout 60,000 pounds of food.",
                "Laughing 100 times is equivalent to\n15 minutes of exercise on a stationary bike.",
                "Maintaining good relationships with family\nand friends is good for your health.", "Yoga can boost your cognitive function and lowers stress."};

        final List<String> list = Arrays.asList(array);

        stringTextView.setText(stringTextView.getText() + getRandomFact(list));

        nextFact = (Button) findViewById(R.id.nextBtn);
        nextFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringTextView.setText("");
                stringTextView.setText(stringTextView.getText() + getRandomFact(list));
            }
        });
    }

    public String getRandomFact(List<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

