package com.kodluyoruz.multithread.synchronization;

public class Table {
    synchronized void printTable(int n) {
//        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
//        }
    }
}
