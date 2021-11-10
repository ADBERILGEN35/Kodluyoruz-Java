package com.kodluyoruz.oop;

import java.util.Random;

public class Dice {
    private int faceValue; //public - private - protected field
    private String name;
    private String surname;

    public int roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1; // 0 - 5 + 1 1-6
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= 6) {
            this.faceValue = faceValue;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
