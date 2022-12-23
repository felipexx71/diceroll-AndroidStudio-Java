package com.example.aleatorizar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void umDado(View view) {
        ImageView imagem = findViewById(R.id.imageView);
        Aleatorizar ale = new Aleatorizar();

        int numero = Aleatorizar.numAleatorio();

        if (numero == 1) {
            imagem.setImageResource(R.drawable.dice_1);
        }else if (numero == 2) {
            imagem.setImageResource(R.drawable.dice_2);
        }else if (numero == 3) {
            imagem.setImageResource(R.drawable.dice_3);
        }else if (numero == 4) {
            imagem.setImageResource(R.drawable.dice_4);
        }else if (numero == 5) {
            imagem.setImageResource(R.drawable.dice_5);
        }else{
            imagem.setImageResource(R.drawable.dice_6);
        }
    }

    public void doisDados(View view) {
        ImageView imagem = findViewById(R.id.imageView);
        ImageView imagem2 = findViewById(R.id.imageView2);
        Aleatorizar ale = new Aleatorizar();

        int numero = Aleatorizar.numAleatorio();
        int numero2 = Aleatorizar.numAleatorio2();

        if (numero == 1) {
            imagem.setImageResource(R.drawable.dice_1);
        }else if (numero == 2) {
            imagem.setImageResource(R.drawable.dice_2);
        }else if (numero == 3) {
            imagem.setImageResource(R.drawable.dice_3);
        }else if (numero == 4) {
            imagem.setImageResource(R.drawable.dice_4);
        }else if (numero == 5) {
            imagem.setImageResource(R.drawable.dice_5);
        }else{
            imagem.setImageResource(R.drawable.dice_6);
        }


        if (numero2 == 1) {
            imagem2.setImageResource(R.drawable.dice_1);
        }else if (numero2 == 2) {
            imagem2.setImageResource(R.drawable.dice_2);
        }else if (numero2 == 3) {
            imagem2.setImageResource(R.drawable.dice_3);
        }else if (numero2 == 4) {
            imagem2.setImageResource(R.drawable.dice_4);
        }else if (numero2 == 5) {
            imagem2.setImageResource(R.drawable.dice_5);
        }else{
            imagem2.setImageResource(R.drawable.dice_6);
        }
    }
}
