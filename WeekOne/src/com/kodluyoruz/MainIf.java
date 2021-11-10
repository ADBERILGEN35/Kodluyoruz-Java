package com.kodluyoruz;

import java.util.Scanner;

public class MainIf {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please fahrenheit: ");
//        double f = in.nextDouble();

//        double cel;
//        cel = 5 / 9.0 * (f - 32);
//        System.out.println(f + " fahreheit is " + cel + " celsius");
//        System.out.println(f);

        /* Boolean Operators
         * <    less than
         * <=   less than or equal
         * >    greater than
         * >=   greater than or equal
         * ==   equal to
         * !=   not equal to
         */

//        boolean bool = f < 300;
//        System.out.println(bool);

        /* Karar Mekanizmaları
         * if
         * switch
         */

        /*
        if (bool) {
            System.out.println("300 den küçük");
        } else {
            System.out.println("300 e eşit ve ya büyük");
        }
        */

        /* Multiple if */

//        if (f == 300) {
//            System.out.println("300 e eşit");
//        } else if (f > 300) {
//            System.out.println("300 den büyük");
//        } else {
//            System.out.println("300 den küçük");
//        }

        /* Logical Operations
         * !    not
         * &&   and
         * ||   or
         * ^    exclusive or
         */

//        if (f >= 300 && f < 500) {
//            System.out.println("300<=f<500");
//        } else if (f == 500 || f == 600) {
//            System.out.println("500 yada 600");
//        }
//        System.out.println("Koşullar bitti");


//        Scanner in = new Scanner(System.in);
//        System.out.println("Please age: ");
//        int age = in.nextInt();
//
//        switch (age) {
//            case 10:
//            case 11:
//            case 12:
//            case 13:
//            case 14:
//            {
//                System.out.println("Yaş 10 - 15");
//                break;
//            }
//            case 15: {
//                System.out.println("Yaş 15");
//                break;
//            }
//            default: {
//                System.out.println("Default");
//            }
//
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please age: ");
//        int x = in.nextInt();
//
//        int y, z;
//        char c;
//
//        if (x >= 0) {
//            y = 1;
//        } else {
//            y = -1;
//        }
//
//        System.out.println(y);
//
//        z = (x >= 0) ? 1 : -1;//variable = (statement) ? true:false
//        c = (x >= 0) ? 'b' : 'd';//variable = (statement) ? true:false
//
//        System.out.println("Z:" + z);
//        System.out.println("C:" + c);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please age: ");
//        int x = in.nextInt();

        /* Örnek yapalım
         * Kullanıcıdan 2 sayı alalım çarpımları
         * 10 - 100 arasıdaysa 5 puan
         * 100 den büyükse 10
         * bunların dışında 0 puan
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Please Number 1: ");
        int num1 = in.nextInt();
        System.out.println("Please Number 2: ");
        int num2 = in.nextInt();

        int result = num1 * num2;

        if (result >= 10 && result <= 100) {
            System.out.println("Result: " + result + " Puan:" + 5);
        } else if (result > 100) {
            System.out.println("Result: " + result + " Puan:" + 10);
        } else {
            System.out.println("Result: " + result + " Puan:" + 0);
        }

    }
}
