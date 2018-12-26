package com.example.gaurav.mindgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static android.R.attr.max;

public class MainActivity extends AppCompatActivity {
    int i = 0, c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        int n, r;

        EditText ne = (EditText) findViewById(R.id.teamB);
        n = Integer.parseInt(ne.getText().toString());

        final EditText fn = (EditText) findViewById(R.id.teamB);
        fn.setText("");


        if (n <= c || (n - 10) > c) {
            displayA();

        } else {

            display0();

            i++;
            if (i < 8) {
                Random rand = new Random();
                c = rand.nextInt(((n + 10) - (n + 1)) + 1) + (n + 1);
                displayB(c);
            } else {
                r = n / 10;
                c = (r * 11) + 1;
                if (c < n)
                    c = c + 11;
                if (c == n) {
                    Random rand = new Random();
                    c = rand.nextInt(((n + 10) - (n + 1)) + 1) + (n + 1);
                    displayB(c);
                } else {
                    if (c <= 100)
                        displayB(c);
                }

            }

            if (c == 100)
                displayD();
            if (n == 100)
                displayC();
        }

    }

    public void displayA() {
        TextView scoreView = (TextView) findViewById(R.id.area);
        scoreView.setText("Wrong Input");
    }

    public void display0() {
        TextView scoreView = (TextView) findViewById(R.id.area);
        scoreView.setText("");
    }

    public void displayB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayC() {
        TextView scoreView = (TextView) findViewById(R.id.area);
        scoreView.setText("YOU WIN");
    }

    public void displayD() {
        TextView scoreView = (TextView) findViewById(R.id.area);
        scoreView.setText("YOU LOSE");
    }

}
