package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v) {
        // Get current value of team a, then add 3 to it and set that as the new value.
        addForTeam("a", 3);
    }

    public void addTwoForTeamA(View v) {
        addForTeam("a", 2);

    }
    public void addOneForTeamA(View v) {
        addForTeam("a", 1);
    }

    private void addForTeam(String team, int i) {
        if(team.equals("a")){
            scoreTeamA = scoreTeamA + i;
            displayForTeamA(scoreTeamA);
        }else if(team.equals("b")) {
            scoreTeamB = scoreTeamB + i;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v) {
//        scoreTeamB = scoreTeamB + 3;
//        displayForTeamB(scoreTeamB);
        addForTeam("b",3);
    }

    public void addTwoForTeamB(View v) {
        addForTeam("b",2);
    }

    public void addOneForTeamB(View v) {
        addForTeam("b",1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        // 1.  set variables to zero to reset score
        scoreTeamA = 0;
        scoreTeamB = 0;

        // 2. Update the display to show new variable scores
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}