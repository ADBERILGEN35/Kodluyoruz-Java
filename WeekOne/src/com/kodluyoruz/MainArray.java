package com.kodluyoruz;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {


//        int[] numbers = new int[3]; // [0][1][2]
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        double[] doubles = {1.0, 2.5};
//        for (int i = 0; i < doubles.length; i++) {
//            System.out.print(doubles[i] + " ");
//        }
//
//        System.out.println();
//        for (double d : doubles) {
//            System.out.print(d + " ");
//        }

//        System.out.println();
//        System.out.println(Arrays.toString(doubles));

//        for (double d :
//                doubles) {
//            System.out.println(d);
//        }

        /*
         [1][2]  indices    0 1 2
                          0 [1][2][3]
         [3][4]           1 [4][5][6]
                          0x1 [0,0]
                          0x2 [0,1]
                          0x3 [0,2]
                          0x4 [1,0]
                          0x5 [1,1]
                          0x6 [1,2]
         */

        int[][] matrice = new int[2][3];
        matrice[0][0] = 1;
        matrice[0][1] = 2;
        matrice[0][2] = 3;
        matrice[1][0] = 4;
        matrice[1][1] = 5;
        matrice[1][2] = 6;

        matrice = new int[3][3];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }
}
