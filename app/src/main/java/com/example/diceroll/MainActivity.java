package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView diceImg;
    Button rollBtn;
    TextView diceNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImg = findViewById(R.id.dice_img);
        rollBtn = findViewById(R.id.rollBtn);
        diceNumberTextView = findViewById(R.id.number);

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNum = new Random().nextInt(9) + 1;

        diceNumberTextView.setText(String.valueOf(randomNum));

        diceImg.setImageResource(R.drawable.dice_7);

        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show();
    }
}
