package com.kodluyoruz.test_static;

public class Circle {
    private double radius;
    private static int count;

    public Circle() {
        this.radius = 1;
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }

    public int getCount1() {
        return count;
    }

}
