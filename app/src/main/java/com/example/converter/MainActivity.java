package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
       TextView output;
       EditText EnterNum;
       Button miles;
       Button meters;
       Button kilometers;
       Button centimeters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.miles);
        meters = findViewById(R.id.meter);
        kilometers = findViewById(R.id.kilometer);
        centimeters = findViewById(R.id.centimeter);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000 );
                output.setText("value in meter : " + meters);
            }
        });
    }
}