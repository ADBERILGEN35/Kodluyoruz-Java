package com.kodluyoruz.test_static;

public class TestStatic {
    public static void main(String[] args) {
        Circle circle = new Circle(); // Memory 0x1b6d3586
        Circle circle1 = circle; //1b6d3586
        circle1.setRadius(2);

        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle1);
        System.out.println(circle1.getRadius());

//        System.out.println(circle.getCount1());
//        System.out.println(Circle.getCount());
//        Circle circle1 = new Circle();
//        System.out.println("Circle " + Circle.getCount());
//        System.out.println("circle1 " + circle1.getCount1());
//        System.out.println("circle " + circle.getCount1());

//        MatematicalOperations matematicalOperations = new MatematicalOperations();
//        System.out.println(
//                matematicalOperations.addition(5, 2)
//        );

        System.out.println(MatematicalOperations.addition(5, 2));

    }
}
