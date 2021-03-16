package com.example.myprojectforpodarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Man extends AppCompatActivity {

    TextView age;
    Button num2_1_0year, num2_1_10year, num2_1_30year, num2_1_60year;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.man);
        age = findViewById(R.id.age);
        num2_1_0year = findViewById(R.id.num2_2_0year);
        num2_1_10year = findViewById(R.id.num2_2_10year);
        num2_1_30year = findViewById(R.id.num2_2_30year);
        num2_1_60year = findViewById(R.id.num2_2_60year);
        
        num2_1_0year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Man.this, Num0year.class);
                i.putExtra("num2_1_0year", num2_1_0year.getText().toString());
                startActivity(i);

            }
        });
        num2_1_10year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Man.this, Num10year.class);
                i.putExtra("num2_1_10year", num2_1_10year.getText().toString());
                startActivity(i);

            }
        });
        num2_1_30year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Man.this, Num30year.class);
                i.putExtra("num2_1_30year", num2_1_30year.getText().toString());
                startActivity(i);

            }
        });
        num2_1_60year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Man.this, Num60year.class);
                i.putExtra("num2_1_60year", num2_1_60year.getText().toString());
                startActivity(i);

            }
        });
    }
}
