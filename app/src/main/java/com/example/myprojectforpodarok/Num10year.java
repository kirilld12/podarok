package com.example.myprojectforpodarok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Num10year extends AppCompatActivity {
    TextView hobby;
    Button sport, game, painting, dance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num0year);

        hobby = findViewById(R.id.hobby);
        sport = findViewById(R.id.sport);
        game = findViewById(R.id.game);
        painting = findViewById(R.id.painting);
        dance = findViewById(R.id.dance);

        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Num10year.this, Sport.class);
                startActivity(i);

            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Num10year.this, Game.class);
                startActivity(i);

            }
        });

        painting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Num10year.this, Painting.class);
                startActivity(i);

            }
        });

        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Num10year.this, Dance.class);
                startActivity(i);

            }
        });



    }
}
