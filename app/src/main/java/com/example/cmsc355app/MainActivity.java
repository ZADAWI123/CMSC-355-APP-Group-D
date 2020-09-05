package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity2.class);
                startActivity(startIntent);
            }
        });
    }
/*
    public void test(){

        final SharedPreferences myPrefs = getSharedPreferences("tag", 0);
        final int []count = {myPrefs.getInt("num",0)};
        //final String[] temp = {""};

        temp  = Integer.toString(count[0]);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        //myEditor.putInt("num", count[0]++).commit();

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                SharedPreferences.Editor myEditor = myPrefs.edit();

                TextView textView2 = (TextView) findViewById(R.id.textView2);
                myEditor.putInt("num", count[0]++).commit();

                temp = Integer.toString(count[0]);
                textView2.setText(temp);
            }


        });



    }

 */
}