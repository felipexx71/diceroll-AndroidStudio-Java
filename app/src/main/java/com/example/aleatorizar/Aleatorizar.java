package com.example.aleatorizar;

import java.util.Random;

public class Aleatorizar {
    static int side = 12;

    public static int numAleatorio() {
        int x = new Random().nextInt(side/2);
        return x;
    }
    public static int numAleatorio2() {
        int y = new Random().nextInt(side/2);
        return y;
    }
}