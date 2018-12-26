package com.example.gaurav.mindgame;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button orderButton = (Button)findViewById(R.id.easy);

        orderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        Button order1Button = (Button)findViewById(R.id.medium);

        order1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(intent);
            }

        });

        Button order2Button = (Button)findViewById(R.id.hard);

        order2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this, Main7Activity.class);
                startActivity(intent);
            }

        });

    }
}

