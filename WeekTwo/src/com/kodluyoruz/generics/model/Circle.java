package com.kodluyoruz.generics.model;

import java.util.Objects;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this("white", false, radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "[Circle] Radius: " + radius + " Perimeter: " + findPerimeter() + " Area: " + findArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
