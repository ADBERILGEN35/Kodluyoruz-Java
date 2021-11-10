package com.kodluyoruz.poly;

public class TestPolymorphism {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle("white", false, 1);
        GeometricObject geometricObject1 = new Rectangle("white", false, 3, 5);
        GeometricObject geometricObject2 = new Cyclinder("white", false, 3, 5);

//        System.out.println("Equal Area?" + equalArea(geometricObject1, geometricObject2));
//
//        Circle circle = new Circle("WHİTE", false, 1);
//        System.out.println("Equal Area?" + equalArea(circle, geometricObject));


        print(geometricObject);
        print(geometricObject1);
        print(geometricObject2);

    }

    private static boolean equalArea(GeometricObject geo1, GeometricObject geo2) {
        return geo1.findArea() == geo2.findArea();
    }

    private static void print(GeometricObject geo) {
        System.out.println();
        System.out.println(geo.toString());
        System.out.println("The area is " + geo.findArea());
        System.out.println("The perimeter is " + geo.findPerimeter());
        if (geo instanceof Cyclinder) {
            System.out.println("The volume is " + ((Cyclinder) geo).findVolume());
        }
    }
}
