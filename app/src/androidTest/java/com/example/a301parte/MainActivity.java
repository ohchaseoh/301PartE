package com.example.a301parte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView editText = (TextView) findViewById(R.id.textView3);

        //Test button
        Button tButton = (Button) findViewById(R.id.testbutton);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //clears text
                editText.setText(" ");

            }
        });

    }
