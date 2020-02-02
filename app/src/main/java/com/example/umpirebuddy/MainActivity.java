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

    protected void setBalls (View view){

    }

    protected void countST (View view){
        strikeCounter++;
        System.out.println(strikeCounter);
        TextView strikesLabel = findViewById(R.id.strikes);
        strikesLabel.setText("Strikes "+strikeCounter);
    }


    protected void countBL (View view){
        ballCounter++;
        TextView ballsLabel = findViewById(R.id.balls);
        ballsLabel.setText("Balls "+ballCounter);

    }

    protected void closeApp (View view){
        finish();
        System.exit(0);
    }

    protected void reset (View view){
        ballCounter = 0;
        strikeCounter = 0;
        System.out.println("BALLS" + ballCounter);
        System.out.println("STRIKES" + strikeCounter);
        TextView ballsLabel = findViewById(R.id.balls);
        TextView strikesLabel = findViewById(R.id.strikes);
        ballsLabel.setText("Balls "+ballCounter);
        strikesLabel.setText("Strikes "+strikeCounter);
    }

}
