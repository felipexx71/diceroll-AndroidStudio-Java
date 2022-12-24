package com.example.aleatorizar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aleatorizar.models.Dice;

public class MainActivity extends AppCompatActivity{
    Dice dice = new Dice();
    Functions func = new Functions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneDice(View view) {
        dice.setImage1(findViewById(R.id.image1));

        switch (func.randomNumOne()) {
            case 1:
                dice.getImage1().setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dice.getImage1().setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dice.getImage1().setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dice.getImage1().setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dice.getImage1().setImageResource(R.drawable.dice_5);
                break;
            default:
                dice.getImage1().setImageResource(R.drawable.dice_6);
                break;
        }
    }

    public void twoDice(View view) {
        dice.setImage1(findViewById(R.id.image1));
        dice.setImage2(findViewById(R.id.image2));

        switch (func.randomNumOne()) {
            case 1:
                dice.getImage1().setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dice.getImage1().setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dice.getImage1().setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dice.getImage1().setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dice.getImage1().setImageResource(R.drawable.dice_5);
                break;
            default:
                dice.getImage1().setImageResource(R.drawable.dice_6);
                break;
        }

        switch (func.randomNumTwo()) {
            case 1:
                dice.getImage2().setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dice.getImage2().setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dice.getImage2().setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dice.getImage2().setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dice.getImage2().setImageResource(R.drawable.dice_5);
                break;
            default:
                dice.getImage2().setImageResource(R.drawable.dice_6);
                break;
        }
}
}
