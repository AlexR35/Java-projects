package android.example.p50x;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView faceImage;
    Button exerciseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faceImage = findViewById(R.id.face_imageview);
        exerciseButton = findViewById(R.id.submit_exercise);

        exerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeToExcerciseActivity();
            }
        });
    }

    private void takeToExcerciseActivity(){

        // CODE TO GO TO NEXT ACTIVITY aka INTENT STARTACTIVITY ETC

        Intent intent = new Intent(this, exerciseActivity.class);
        startActivity(intent);
    }
}