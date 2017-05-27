package com.example.android.golfscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreEdwin = 72;
    int ScoreOpponent = 72;
    int CoursePar = 72;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Edwin.
     */
    public void displayForEdwin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Edwin_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Opponent.
     */
    public void displayForOpponent(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Opponent_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Edwin by Two.
     */
    public void addTwoForEdwin(View v) {

        ScoreEdwin += 2;
        displayForEdwin(ScoreEdwin);
    }

    /**
     * Increase the score for Edwin by One.
     */
    public void addOneForEdwin(View v) {

        ScoreEdwin += 1;
        displayForEdwin(ScoreEdwin);
    }

    /**
     * Decrease the score for Edwin by One.
     */
    public void subtractOneForEdwin(View v) {

        ScoreEdwin -= 1;
        displayForEdwin(ScoreEdwin);
    }

    /**
     * Decrease the score for Edwin by Two.
     */
    public void subtractTwoForEdwin(View v) {

        ScoreEdwin -= 2;
        displayForEdwin(ScoreEdwin);
    }

    /**
     * Increase the score for Opponent by Two.
     */
    public void addTwoForOpponent(View v) {

        ScoreOpponent += 2;
        displayForOpponent(ScoreOpponent);
    }

    /**
     * Increase the score for Opponent by One.
     */
    public void addOneForOpponent(View v) {

        ScoreOpponent += 1;
        displayForOpponent(ScoreOpponent);
    }

    /**
     * Decrease the score for Opponent by One.
     */
    public void subtractOneForOpponent(View v) {

        ScoreOpponent -= 1;
        displayForOpponent(ScoreOpponent);
    }

    /**
     * Decrease the score for Opponent by Two.
     */
    public void subtractTwoForOpponent(View v) {

        ScoreOpponent -= 2;
        displayForOpponent(ScoreOpponent);
    }

    /**
     * Resets the score for Edwin and Opponent.
     */
    public void resetScore(View v) {

        ScoreEdwin = CoursePar;
        ScoreOpponent = CoursePar;
        ;
        displayForEdwin(ScoreEdwin);
        displayForOpponent(ScoreOpponent);
    }
}
