package android.example.p50x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class exerciseActivity extends AppCompatActivity {

    String exerciseTitle;
    EditText titleEditText;
    String repsTextTitle;
    EditText repsEditText;
    String setsTextTitle;
    EditText setsEditText;
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        shareButton = findViewById(R.id.share_button);
        titleEditText = findViewById(R.id.title_edittext);
        repsEditText = findViewById(R.id.reps_editText);
        setsEditText = findViewById(R.id.sets_editText);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseTitle = titleEditText.getText().toString();

                repsTextTitle = repsEditText.getText().toString();

                setsTextTitle = setsEditText.getText().toString();
                Log.v("setOnClickListener", setsTextTitle);

               shareToFriends();



                // Add a random name input for the person we are sending this too
            }

        });

        //Create another method to display the onClick organized nicely.
    }
    public String exerciseSummary(String exerciseName, String numberOfReps, String numberOfSets) {

    String exerciseMessage = "Exercise type were " + exerciseName;
    exerciseMessage+= ("\n");
    exerciseMessage += "The number of reps done were: " + numberOfReps;
    exerciseMessage+= ("\n");
    exerciseMessage += "The total number of sets done were: " + numberOfSets;
    return exerciseMessage;
}
    private void shareToFriends() {

        // code to share to friends, just like that last lesson you did with the intents and data and shit
        // Re write this code below out
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, exerciseSummary(exerciseTitle,repsTextTitle,setsTextTitle));
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent,null);
        startActivity(shareIntent);
    }

  //  public String exerciseSummary(String titleEditText, String repsEditText, String setsEditText) {
//    String exerciseMessage = "Exercise Name: " + titleEditText;
//    exerciseMessage += "The number of reps done were: " + repsEditText;
//    exerciseMessage += "The total number of sets done were: " + setsEditText;
//    return exerciseMessage;

//        String formattedString = new StringBuilder();
//                .append("Exercise name: " + titleEditText)
//                .append("\n")
//                .append("The number of sets done were: " + repsEditText);
//                .append("\n")
//                .append("You completed " + setsEditText);
//                .append('\n')
//
//                .toString();

}