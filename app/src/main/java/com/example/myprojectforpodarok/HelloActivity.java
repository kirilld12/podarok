package com.example.myprojectforpodarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

TextView hello1,hello2,hello3;
Button polMan, polWoman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_main);

        hello1 = findViewById(R.id.hello1);
        hello2 = findViewById(R.id.hello2);
        hello3 = findViewById(R.id.hello3);
        polMan = findViewById(R.id.polMan);
        polWoman = findViewById(R.id.polWoman);

        polMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelloActivity.this, Man.class);
                startActivity(i);
            }
        });

        polWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelloActivity.this, Woman.class);
                startActivity(i);
            }
        });


    }
}
