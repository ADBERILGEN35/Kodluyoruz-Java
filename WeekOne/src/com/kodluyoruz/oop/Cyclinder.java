package com.kodluyoruz.oop;

public class Cyclinder extends Circle {
    private double height;

    public Cyclinder(double height) {
        super();
        this.height = height;
    }

    public Cyclinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double findVolume() {
        return findArea() * height;
    }
}

