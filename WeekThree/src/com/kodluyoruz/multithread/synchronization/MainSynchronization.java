package com.kodluyoruz.multithread.synchronization;

public class MainSynchronization {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new MyThread1(table);
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(new MyThread2(table));
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        table.printTable(1000);

        /*
        1. MIN_PRIORITY = 1
        2. NORM_PRIORITY = 5
        3. MAX_PRIORTY = 10
        When multiple threads are ready for execution,
        the highest priority thread is selected and executed by JVM.
        In case when a high priority thread stops, yields, or enters into the blocked state,
        a low priority thread starts executing.
         */
    }
}
