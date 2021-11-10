package com.kodluyoruz;

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {
        /* Döngüler (Loops)
         * while loop
         * do-while loop
         * for loop
         */

//        int count = 0;
//        while (count < 10) {
//            System.out.println("Count: " + count);
//            count+=2;
//        }
//
//        System.out.println("-----");
//
//        count = 0;
//        do {
//            System.out.println("Count: " + count);
//            count+=2;
//        } while (count < 10);
//
//        System.out.println("-----");
//
//        for (int i = 0; i < 10; i+=2) {
//            System.out.println("Count: " + i);
//        }

        /* Örnek yapalım
         * Kullanıcıdan 2 sayı alalım çarpımları
         * 10 - 100 arasıdaysa 5 puan
         * 100 den büyükse 10
         * bunların dışında 0 puan
         * Kullanıcı -1 girerse bitirelim
         */

        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, point = 0;
        while (num1 != -1 || num2 != -1) {
            System.out.println("Please Number 1: ");
            num1 = in.nextInt();
            System.out.println("Please Number 2: ");
            num2 = in.nextInt();

            int result = num1 * num2;

            if (result >= 10 && result <= 100) {
                point += 5;
                System.out.println("Result: " + result + " Puan:" + 5 + " Total Puan: " + point);
            } else if (result > 100) {
                point += 10;
                System.out.println("Result: " + result + " Puan:" + 10 + " Total Puan: " + point);
            } else {
                System.out.println("Result: " + result + " Puan:" + 0 + " Total Puan: " + point);
            }
        }

    }
}
