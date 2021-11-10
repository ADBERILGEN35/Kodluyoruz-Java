package com.kodluyoruz.multithread.communication;

public class MainCommunication {
    public static void main(String[] args) {
        /*
        1) wait() method
            The wait() method causes current thread to release
            the lock and wait until either another thread invokes the notify()
            method or the notifyAll() method for this object, or a specified amount of time has elapsed.

            The current thread must own this object's monitor,
            so it must be called from the synchronized method only otherwise it will throw exception.

        2) notify() method
            The notify() method wakes up a single thread that is waiting on this object's monitor.
            If any threads are waiting on this object, one of them is chosen to be awakened.
            The choice is arbitrary and occurs at the discretion of the implementation.

        3) notifyAll() method
Wakes       up all threads that are waiting on this object's monitor.
         */
        final Customer customer = new Customer();
        new Thread(()-> customer.withdraw(15000)).start();
        new Thread(()-> customer.deposit(10000)).start();
    }
}
