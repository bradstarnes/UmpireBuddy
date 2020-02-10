package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.view.Gravity;
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

    public void countST (View view){
        TextView strikesbutton = findViewById(R.id.strike_button);
        strikesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TextView strikesLabel = findViewById(R.id.strikes);
                strikeCounter++;
                if ( strikeCounter == 3){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("STRIKE OUT!")
                            .setMessage("That's too bad! You've struck out.")
                            .setNeutralButton("Close", null)
                            .setIcon(android.R.drawable.stat_sys_warning).show();
                    strikeCounter = 0;
                    ballCounter = 0;

                };
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

                if ( ballCounter == 3){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("WALK THAT BATTER! ")
                            .setMessage("The batter has been walked!! ")
                            .setNeutralButton("Close", null)
                            .setIcon(android.R.drawable.stat_sys_warning).show();
                    strikeCounter = 0;
                    ballCounter = 0;
                };
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

    public void aboutPopup (View view){
        TextView aboutButton = findViewById(R.id.aboutScreen);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Umpire Buddy V2.0 ")
                        .setMessage("Developed by Brad Starnes")
                        .setNeutralButton("Close", null)
                        .setIcon(android.R.drawable.stat_sys_warning).show();
            }
        });
    }
}
