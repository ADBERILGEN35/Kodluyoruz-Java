package com.kodluyoruz.exception_handling;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius 0 dan büyük olmalı");
        }
        this.radius = radius;
    }

    public double findArea() throws CustomRuntimeException {
        throw new CustomException2("Find area is not implemented");
//        return Math.pow(radius, 2) * Math.PI;
    }

}
