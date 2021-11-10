package com.kodluyoruz.recursive;

public class MainRecursive {
    public static void main(String[] args) {
        // 0 1 1 2 3
//        fibonacci(10);
//        for (int i = 0; i < 5; i++) {
//            System.out.print(fib(i) + " ");
//        }

        System.out.println(a(10));

    }

    static void fibonacci(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;

        while (counter < N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    //5
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        // 4 + 3
        return fib(n - 1) + fib(n - 2);
    }

    static int a(int n){
        return b(n-1);
    }

    static int b(int n){
        return a(n-1);
    }
}
