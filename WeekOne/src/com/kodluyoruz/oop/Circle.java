package com.kodluyoruz.oop;

public class Circle {
    public double radius; //public - private - protected

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }


}
