package com.example.gaurav.mindgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static android.R.attr.max;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Main3Activity extends AppCompatActivity {
    int n=0,c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void submit1(View view) {

        display0();

        EditText ne = (EditText) findViewById(R.id.teamA);
        n = Integer.parseInt(ne.getText().toString());

        final EditText fn = (EditText) findViewById(R.id.teamA);
        fn.setText("");

        if (n <= c || (n - 10) > c) {
            displayA1();

        }
        else {

            turn2();

            Button m2Edit = (Button) findViewById(R.id.sub1);
            m2Edit.setEnabled(false);

            Button m3Edit = (Button) findViewById(R.id.sub2);
            m3Edit.setEnabled(true);

            EditText mEdit = (EditText) findViewById(R.id.teamA);
            mEdit.setEnabled(false);

            EditText m1Edit = (EditText) findViewById(R.id.teamB);
            m1Edit.setEnabled(true);

            displayB1(n);

            if(c==100) {
                displayC2();
                displayD1();
            }
            if(n==100) {
                displayC1();
                displayD2();
            }
        }

    }

    public void submit2(View view) {

        display0();

        EditText ne = (EditText) findViewById(R.id.teamB);
        c = Integer.parseInt(ne.getText().toString());

        final EditText fn = (EditText) findViewById(R.id.teamB);
        fn.setText("");

        if (c <= n || (c - 10) > n) {
            displayA2();

        } else {

            turn1();

            Button m2Edit = (Button) findViewById(R.id.sub2);
            m2Edit.setEnabled(false);

            Button m3Edit = (Button) findViewById(R.id.sub1);
            m3Edit.setEnabled(true);

            EditText mEdit = (EditText) findViewById(R.id.teamB);
            mEdit.setEnabled(false);

            EditText m1Edit = (EditText) findViewById(R.id.teamA);
            m1Edit.setEnabled(true);
            displayB2(c);

            if(c==100) {
                displayC2();
                displayD1();
            }
            if(n==100) {
                displayD2();
                displayC1();
            }
        }

    }

    public void display0(){
        TextView scoreView = (TextView) findViewById(R.id.area1);
        scoreView.setText("");
        TextView score2View = (TextView) findViewById(R.id.area2);
        score2View.setText("");
    }

    public void turn1(){
        TextView scoreView = (TextView) findViewById(R.id.teamA1);
        scoreView.setText("Your Turn");
    }

    public void turn2(){
        TextView scoreView = (TextView) findViewById(R.id.teamB1);
        scoreView.setText("Your Turn");
    }

    public void displayA1() {
        TextView scoreView = (TextView) findViewById(R.id.area1);
        scoreView.setText("Wrong Input");
    }

    public void displayA2() {
        TextView scoreView = (TextView) findViewById(R.id.area2);
        scoreView.setText("Wrong Input");
    }

    public void displayB1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayC1() {
        TextView scoreView = (TextView) findViewById(R.id.area1);
        scoreView.setText("YOU WIN");
    }

    public void displayD1() {
        TextView scoreView = (TextView) findViewById(R.id.area1);
        scoreView.setText("YOU LOSE");
    }

    public void displayB2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayC2() {
        TextView scoreView = (TextView) findViewById(R.id.area2);
        scoreView.setText("YOU WIN");
    }

    public void displayD2() {
        TextView scoreView = (TextView) findViewById(R.id.area2);
        scoreView.setText("YOU LOSE");
    }

}
