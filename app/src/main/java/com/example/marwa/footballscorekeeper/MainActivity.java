package com.example.marwa.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the Football Scorekeeper for 2 teams.
 */

public class MainActivity extends AppCompatActivity {

    // Tracks the goals for Team A
    int goalTeamA = 0;

    // Tracks the fouls for Team A
    int foulTeamA = 0;

    // Tracks the goals for Team B
    int goalTeamB = 0;

    // Tracks the fouls for Team A
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addGoalsForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalsForTeamA(goalTeamA);
    }

    public void addFoulsForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);
    }

    public void addGoalsForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalsForTeamB(goalTeamB);
    }


    public void addFoulsForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);
    }


    /**
     * Displays the goals for Team A.
     */
    public void displayGoalsForTeamA(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(goal));
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulsForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }


    /**
     * Displays the goals for Team B.
     */
    public void displayGoalsForTeamB(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(goal));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }


    public void resetScore(View view) {
        goalTeamA = 0;
        foulTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        displayGoalsForTeamA(goalTeamA);
        displayFoulsForTeamA(foulTeamA);
        displayGoalsForTeamB(goalTeamB);
        displayFoulsForTeamB(foulTeamB);
    }


}
