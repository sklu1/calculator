package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickPlus(View view){
        // Log.i("INFO", "Button Pressed");
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(firstNum.getText().toString(), secondNum.getText().toString(), "+");
    }

    public void clickMinus(View view){
        // Log.i("INFO", "Button Pressed");
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(firstNum.getText().toString(), secondNum.getText().toString(), "-");
    }

    public void clickMult(View view){
        // Log.i("INFO", "Button Pressed");
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(firstNum.getText().toString(), secondNum.getText().toString(), "*");
    }

    public void clickDiv(View view){
        // Log.i("INFO", "Button Pressed");
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(firstNum.getText().toString(), secondNum.getText().toString(), "/");
    }

    public void goToActivity(String first, String second, String op) {
        Intent intent = new Intent(this, Calculate.class);
        intent.putExtra("firstNum", first);
        intent.putExtra("firstSecond", second);
        intent.putExtra("op", op);
        startActivity(intent);
    }

}