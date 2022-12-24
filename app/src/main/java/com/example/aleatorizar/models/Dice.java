package com.example.aleatorizar.models;

import android.widget.ImageView;

public class Dice {
    private ImageView image1;
    private ImageView image2;
    private int side = 12;

    public ImageView getImage1() {
        return this.image1;
    }

    public ImageView getImage2() {
        return this.image2;
    }

    public void setImage1(ImageView image1) {
        this.image1 = image1;
    }

    public void setImage2(ImageView image2) {
        this.image2 = image2;
    }

    public int getSide() {
        return side;
    }
}
