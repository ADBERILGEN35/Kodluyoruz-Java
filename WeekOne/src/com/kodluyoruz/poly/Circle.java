package com.kodluyoruz.poly;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double findArea() {
        return radius * radius * Math.PI;
    }


    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }
}
