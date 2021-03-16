package com.example.myprojectforpodarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Woman extends AppCompatActivity {

    TextView age;
    Button num2_2_0year, num2_2_10year, num2_2_30year, num2_2_60year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.woman);
        age = findViewById(R.id.age);
        num2_2_0year = findViewById(R.id.num2_2_0year);
        num2_2_10year = findViewById(R.id.num2_2_10year);
        num2_2_30year = findViewById(R.id.num2_2_30year);
        num2_2_60year = findViewById(R.id.num2_2_60year);

        num2_2_0year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Woman.this, Num0year.class);
                i.putExtra("num2_2_0year", num2_2_0year.getText().toString());
                startActivity(i);
            }
        });
        num2_2_10year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Woman.this, Num10year.class);
                i.putExtra("num2_2_10year", num2_2_10year.getText().toString());
                startActivity(i);

            }
        });
        num2_2_30year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Woman.this, Num30year.class);
                i.putExtra("num2_2_30year", num2_2_30year.getText().toString());
                startActivity(i);

            }
        });
        num2_2_60year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Woman.this, Num60year.class);
                i.putExtra("num2_2_60year", num2_2_60year.getText().toString());
                startActivity(i);

            }
        });
    }
}