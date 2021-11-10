package com.kodluyoruz.multithread;

public class MainThread {
    public static void main(String[] args) {
////        longTask();
//        System.out.println("Uzun işlem sonrası");

        System.out.println("Uzun işlem başlatılıyor");
        Thread thread = new Thread(MainThread::longTask);
        thread.start();
        System.out.println("Thread çalıştı");
    }

    static void longTask() {
        try {
            Thread.sleep(10000);
            System.out.println("Uzun işlem sonlandı. Thread Name:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
