package com.kodluyoruz.generics;

import com.kodluyoruz.generics.model.Circle;
import com.kodluyoruz.generics.model.GeometricObject;
import com.kodluyoruz.generics.model.Rectangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainGenerics {
    public static void main(String[] args) {
        Object o = new String("ali");


        GenericClass<String> genericClass = new GenericClass<>("ali");
        System.out.println(genericClass.getItem());
        GenericClass<Integer> genericClass1 = new GenericClass<>(1);
        System.out.println(genericClass1.getItem());

        ObjectClass objectClass = new ObjectClass("ali");
        System.out.println(objectClass.getItem());
        ObjectClass objectClass1 = new ObjectClass(1);
        System.out.println(objectClass1.getItem());

        System.out.println("----");

        Circle circle = new Circle(1);
        GeometricGeneric<Circle> geometricGeneric = new GeometricGeneric<>(circle);
        System.out.println(geometricGeneric.getGeometricObject().findPerimeter());
        System.out.println(geometricGeneric.findPerimeter());


        String[] array = {"Ali", "Ahmet"};
        Integer[] array2 = {1, 2, 3};
        printArray(array);
        printArray(array2);

        System.out.println("---");
        GeometricObject[] geometricObjects = {new Circle(1), new Rectangle(1, 2)};
        printGeoArray(geometricObjects);

        Circle[] circles = {new Circle(2), new Circle(3)};
        printGeoArray(circles);



    }

    public static <T> void printArray(T[] arr) {
        for (T item :
                arr) {
            System.out.println(item);
        }
    }

    public static <T extends GeometricObject> void printGeoArray(T[] arr) {
        for (GeometricObject item :
                arr) {
            System.out.println("Area: " + item.findArea());
        }
    }


}
