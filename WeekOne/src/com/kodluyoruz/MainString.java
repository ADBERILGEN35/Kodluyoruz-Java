package com.kodluyoruz;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        /* String */
//        char c = 'a';
//        String m;
//        m = "Hello world";
//        System.out.println(m);

//        String n, p;
//        int x = 10;
//        n = "Hello" + " " + "World";
//        p = n + x;
//
//        System.out.println(n);
//        System.out.println(p);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Sayı giriniz:");
//        String input = in.nextLine();
//
//
//        System.out.println("Input: " + input);
//        int num = Integer.parseInt(input);
//        System.out.println(num);

        /* Örnek: Ekrana aşağıdaki şekli yazdıralım
         * + + +
         * + + +
         * + + +
         */

//        int i, j;
//        i = 1;
//        while (i <= 3) {
//            j = 1;
//            while (j <= 3) {
//                System.out.print("+ ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("+ ");
//            }
//            System.out.println();
//        }

        String s1, s2, s3, s4;
        s1 = "Ali";
        s2 = new String("Welcome");
        s1 = new String("Veli");
        s3 = "Veli";
        s4 = "veli";


//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equalsIgnoreCase(s4));

//        s4 = s2 + s1;
//        System.out.println(s4);

//        s4 = s2.concat(s1);
//        System.out.println(s4);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }


        int num1=5;
        int num2=2;
        MainMethod.multiply(num1,num2);
        MainMethod mainMethod = new MainMethod();
        mainMethod.multiply2(num1,num2);
    }
}
