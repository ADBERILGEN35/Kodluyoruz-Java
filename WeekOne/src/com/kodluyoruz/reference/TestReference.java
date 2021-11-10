package com.kodluyoruz.reference;

public class TestReference {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        swap(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        Matematical matematical = new Matematical(5, 3);
        swap(matematical);

        System.out.println(matematical.num1);
        System.out.println(matematical.num2);


    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void swap(Matematical matematical) {
        int temp = matematical.num1;
        matematical.num1 = matematical.num2;
        matematical.num2 = temp;
    }
}
