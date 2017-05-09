package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app counts points received in the quiz.
 */

public class MainActivity extends AppCompatActivity {
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int question1(View view) {
        EditText letter = (EditText) findViewById(R.id.question1);
        String answer = letter.getText().toString();
        if (answer.equals("32")) {
            points += 1;
        }
        return points;
    }


    public int question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.capital3:
                if (checked)
                    points += 1;
        }
        return points;
    }

    public int question3(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        int person1 = 0;
        int person2 = 0;
        int person3 = 0;
        int person4 = 0;
        int person5 = 0;
        int person6 = 0;

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.person1:
                if (checked)
                    person1 += 1;
            case R.id.person2:
                if (checked)
                    person2 += 1;
            case R.id.person3:
                if (checked)
                    person3 -= 1;
            case R.id.person4:
                if (checked)
                    person4 += 1;
            case R.id.person5:
                if (checked)
                    person5 += 1;
            case R.id.person6:
                if (checked)
                    person6 -= 1;
        }

        if (person1 == 1 && person2 == 1 && person3 == -1 && person4 == 1 && person5 == 1 && person6 == -1) {
            points += 1;
        }

        return points;
    }

    public int question4(View View) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        String answer1 = number1.getText().toString();
        answer1 = answer1.trim();
        EditText number2 = (EditText) findViewById(R.id.number2);
        String answer2 = number2.getText().toString();
        answer2 = answer2.trim();
        if (answer1.equals("1")) {
            points += 1;
        }
        if (answer2.equals("2")) {
            points += 1;
        }

        return points;
    }

    public int question5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.flag2:
                if (checked)
                    points += 1;
        }
        return points;
    }

    public int question6(View View) {
        EditText letter = (EditText) findViewById(R.id.question6);
        String answer = letter.getText().toString();
        if (answer.equals("303")) {
            points += 1;
        }
        return points;
    }

    public int question7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.city3:
                if (checked)
                    points += 1;
        }
        return points;
    }

    public int submit(View View) {
        Toast.makeText(getApplicationContext(), "You got " + points + "/6 points!", Toast.LENGTH_LONG).show();
        //points = 0;
        return points;
    }

}