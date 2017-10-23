package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button ask_button;
        ask_button= (Button) findViewById(R.id.Askbutton);
        final ImageView Bull;
        Bull= (ImageView)findViewById(R.id.Ball);
        final int []bull_arr={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumgen = new Random();
                int random = randomnumgen.nextInt(6);
                Bull.setImageResource(bull_arr[random]);
            }
        });

    }
}
