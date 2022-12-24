package com.example.aleatorizar;

import com.example.aleatorizar.models.Dice;

import java.util.Random;

public class Functions {
    Dice dice = new Dice();
    
    int randomNumOne() {
        int numRandom = new Random().nextInt(dice.getSide()/2);
        return numRandom;
    }
    int randomNumTwo() {
        int numRandom = new Random().nextInt(dice.getSide()/2);
        return numRandom;
    }
}
