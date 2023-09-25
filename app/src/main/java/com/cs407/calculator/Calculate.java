package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String first = intent.getStringExtra("firstNum");
        String second = intent.getStringExtra("firstSecond");
        String op = intent.getStringExtra("op");
        Integer firstInt = Integer.parseInt(first);
        Integer secondInt = Integer.parseInt(second);
        Double output = new Double(0);
        if (op.equals("+")) {
            output = (double) firstInt + (double) secondInt;
        }
        else if (op.equals("-")) {
            output = (double) firstInt - (double) secondInt;
        }
        else if (op.equals("*")) {
            output = (double) firstInt * (double) secondInt;
        }
        else if (op.equals("/")) {
            output = (double) firstInt / (double) secondInt;
        }
        textView.setText(output.toString());
    }
}