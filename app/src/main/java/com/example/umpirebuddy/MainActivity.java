package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int strikeCounter;
    int ballCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        strikeCounter = 0;
        ballCounter = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkforBalls( View view){


    }

    public void checkforStrikes( View view){

    }

    public void countST (View view){
        TextView strikesbutton = findViewById(R.id.strike_button);
        strikesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if ( strikeCounter == 3){
                    popUp.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
                    popUp.update(50, 50, 300, 80);
                }
                TextView strikesLabel = findViewById(R.id.strikes);
                strikeCounter++;
                System.out.println(strikeCounter);
                strikesLabel.setText("Strikes "+strikeCounter);
            }
        });
    }


    public void countBL (View view){
        TextView ballButton = findViewById(R.id.ball_button);

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TextView ballLabel = findViewById(R.id.balls);
                ballCounter++;
                System.out.println(ballCounter);
                ballLabel.setText("Balls "+ ballCounter);
            }
        });
    }

    public void closeApp (View view){
        TextView exitbutton = findViewById(R.id.exit);
        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
                System.exit(0);
            }
        });
    }

    public void reset (View view){
        TextView resetButton = findViewById(R.id.reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                ballCounter = 0;
                strikeCounter = 0;
                TextView ballsLabel = findViewById(R.id.balls);
                TextView strikesLabel = findViewById(R.id.strikes);
                ballsLabel.setText("Balls "+ballCounter);
                strikesLabel.setText("Strikes "+strikeCounter);
            }
        });
    }

}
