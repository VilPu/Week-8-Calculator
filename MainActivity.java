package com.example.week11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText secondNum;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        output = findViewById(R.id.textView);

    }

    public void check(View view) {

    }
    public void calculatePlus(View view) {
            int first = Integer.parseInt(firstNum.getText().toString());
            int second = Integer.parseInt(secondNum.getText().toString());
            int result = first + second;
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            output.setText(sb.toString());
    }

    public void calculateMinus(View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());
        int result = first - second;
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        output.setText(sb.toString());
    }


    public void calculateMultiplication(View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());
        int result = first * second;
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        output.setText(sb.toString());
    }


    public void calculateDivision(View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(secondNum.getText().toString());
        float result = (float)first / (float)second;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.getDefault(), "%.3f", result));
        output.setText(sb.toString());
    }

}

