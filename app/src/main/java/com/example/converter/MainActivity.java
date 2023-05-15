package com.example.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
       TextView output;
       EditText EnterNum;
       Button mile;
       Button meters;
       Button kilometers;
       Button centimeters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        mile = findViewById(R.id.miles);
        meters = findViewById(R.id.meter);
        kilometers = findViewById(R.id.kilometer);
        centimeters = findViewById(R.id.centimeter);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meter = (number * 1000 );
                output.setText("\n\n\n\nvalue in meters : " + meter);
            }
        });
        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double centimeter = (number * 100000 );
                output.setText("\n\n\n\nvalue in centimeter : " + centimeter);
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double kilometer = (number);
                output.setText("\n\n\n\n value in kilometer : " + kilometer);
            }
        });

        mile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number / 1.609);
                output.setText("\n\n\n\nvalue in miles : " + miles);
            }
        });
    }
}