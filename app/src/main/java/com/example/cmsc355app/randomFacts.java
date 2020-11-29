package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class randomFacts extends AppCompatActivity {

    TextView stringTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_facts);
        stringTextView = findViewById(R.id.randomText);

        String[] array = {"Health is a state of physical, mental and social well-being in which disease and infirmity are absent.",
                "The word 'gymnasium' comes from the Greek word gymnazein, which means 'to exercise naked.'",
                "You burn more calories sleeping than you do watching television.", "During your lifetime, you'll eat about 60,000 pounds of food.",
                "Laughing 100 times is equivalent to 15 minutes of exercise on a stationary bike.",
                "Maintaining good relationships with family and friends is good for your health.", "Yoga can boost your cognitive function and lowers stress."};

        List<String> list = Arrays.asList(array);

        stringTextView.setText(stringTextView.getText() + getRandomFact(list));
    }
    public String getRandomFact(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}