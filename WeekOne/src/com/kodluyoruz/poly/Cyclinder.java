package com.kodluyoruz.poly;

public class Cyclinder extends Circle {
    private double height;

    public Cyclinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findVolume() {
        return findArea() * height;
    }

    public double findArea() {
        return 5;
    }

    public double findArea(double d) {
        return 5;
    }
}
