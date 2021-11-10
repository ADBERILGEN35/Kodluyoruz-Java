package com.kodluyoruz.exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainExceptionHandling {
    public static void main(String[] args) {
//        print("Test");

        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
        } catch (FileNotFoundException ignored) {
            System.out.println("File not found");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen sayı giriniz: ");
//        int num = -1;
//        try{
//            num = scanner.nextInt();
//        } catch (Exception e){
//            System.out.println("Input hatalı");
//        } finally {
//            System.out.println("Her zaman çalışır");
//        }
//
//        if (num != -1){
//            System.out.println("Input: " + num);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius:");

        Circle circle = null;
        try {
            double radius = scanner.nextDouble();
            circle = new Circle(radius);
        } catch (IllegalArgumentException e) {
            System.out.println("Hatalı veri! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Hatalı input formatı!");
        }

        if (circle != null) {
//            try {
//                circle.findArea();
//            } catch (CustomRuntimeException e) {
//                System.out.println(e.getLocalizedMessage());
//            }
            try {
                circle.findArea();
            } catch (CustomRuntimeException e) {
                e.printStackTrace();
            }
        }


    }

    public static void print(String name) {
        print(name);
    }

}
