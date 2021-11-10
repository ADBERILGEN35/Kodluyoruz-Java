package com.kodluyoruz.generics.model;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this("white", false, width, height);
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }

    @Override
    public double findPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "[Rectangle] Perimeter: "+findPerimeter() +" Area: "+findArea();
    }
}
