package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void two(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void free(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threeB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
