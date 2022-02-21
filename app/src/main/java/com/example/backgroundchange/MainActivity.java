package com.example.backgroundchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeColour = findViewById(R.id.changecolor);
        changeColour.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                findViewById(R.id.activity_main).setBackgroundColor(getColour());
            }
        });
    }
    private int getColour() {
        ArrayList<Integer> colour = new ArrayList<>();
        colour.add(Color.BLUE);
        colour.add(Color.RED);
        colour.add(Color.YELLOW);
        colour.add(Color.BLACK);
        colour.add(Color.WHITE);
        colour.add(Color.GREEN);
        int min = 0, max = colour.size() - 1;
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return colour.get(random);
    }
}