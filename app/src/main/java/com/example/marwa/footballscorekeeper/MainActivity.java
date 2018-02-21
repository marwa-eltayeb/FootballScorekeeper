package com.example.marwa.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the Football Scorekeeper for 2 teams.
 */

public class MainActivity extends AppCompatActivity {


    /**
     * Keys is used for saving and restoring values
     */
    private final String GOAL_TEAM_A = "goalTeamA";
    private final String FOUL_TEAM_A = "foulTeamA";
    private final String GOAL_TEAM_B = "goalTeamB";
    private final String FOUL_TEAM_B = "foulTeamB";


    /**
     * Tracks the goals for Team A.
     */
    int goalTeamA = 0;
    /**
     * Tracks the fouls for Team A.
     */
    int foulTeamA = 0;
    /**
     * Tracks the goals for Team B.
     */
    int goalTeamB = 0;
    /**
     * Tracks the fouls for Team A.
     */
    int foulTeamB = 0;
    /**
     * Shows the goals of team A.
     */
    TextView goalA;
    /**
     * Shows the fouls of team A.
     */
    TextView foulA;
    /**
     * Shows the goals of team B.
     */
    TextView goalB;
    /**
     * Shows the fouls of team B.
     */
    TextView foulB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Get references using findViewById() method */
        goalA = (TextView) findViewById(R.id.team_a_goal);
        foulA = (TextView) findViewById(R.id.team_a_foul);
        goalB = (TextView) findViewById(R.id.team_b_goal);
        foulB = (TextView) findViewById(R.id.team_b_foul);


        /* Gets the goals and the fouls after the device is rotated. */
        if (savedInstanceState != null) {
            goalTeamA = savedInstanceState.getInt(GOAL_TEAM_A);
            foulTeamA = savedInstanceState.getInt(FOUL_TEAM_A);
            goalTeamB = savedInstanceState.getInt(GOAL_TEAM_B);
            foulTeamB = savedInstanceState.getInt(FOUL_TEAM_B);
            displayGoalsForTeamA(goalTeamA);
            displayFoulsForTeamA(foulTeamA);
            displayGoalsForTeamB(goalTeamB);
            displayFoulsForTeamB(foulTeamB);
        }


    }

    /**
     * Increase the goals for Team A by 1 point.
     */
    public void addGoalsForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalsForTeamA(goalTeamA);
    }

    /**
     * Increase the fouls for Team A by 1 point.
     */
    public void addFoulsForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * Increase the goals for Team B by 1 point.
     */
    public void addGoalsForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalsForTeamB(goalTeamB);
    }

    /**
     * Increase the fouls for Team B by 1 point.
     */
    public void addFoulsForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);
    }


    /**
     * Displays the goals for Team A.
     */
    public void displayGoalsForTeamA(int goal) {
        goalA.setText(String.valueOf(goal));
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulsForTeamA(int foul) {
        foulA.setText(String.valueOf(foul));
    }


    /**
     * Displays the goals for Team B.
     */
    public void displayGoalsForTeamB(int goal) {
        goalB.setText(String.valueOf(goal));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamB(int foul) {
        foulB.setText(String.valueOf(foul));
    }


    /**
     * Reset the goals and fouls of the game.
     */
    public void resetGame(View view) {
        goalTeamA = 0;
        foulTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        displayGoalsForTeamA(goalTeamA);
        displayFoulsForTeamA(foulTeamA);
        displayGoalsForTeamB(goalTeamB);
        displayFoulsForTeamB(foulTeamB);
    }


    /**
     * Saves the goals and fouls when the device is rotated.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(GOAL_TEAM_A, goalTeamA);
        savedInstanceState.putInt(FOUL_TEAM_A, foulTeamA);
        savedInstanceState.putInt(GOAL_TEAM_B, goalTeamB);
        savedInstanceState.putInt(FOUL_TEAM_B, foulTeamB);
    }


}
