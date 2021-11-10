package com.kodluyoruz.collections;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ali");
        queue.add("Ahmet");
        printQueue(queue);

        System.out.println("---");

        String firsElement = queue.poll();
        System.out.println(firsElement);

        System.out.println("---");

        printQueue(queue);

        System.out.println("---");

        String peek = queue.peek();
        System.out.println(peek);

        System.out.println("---");
        printQueue(queue);

        System.out.println("---");

        Queue<String> queue2 = new LinkedList<>();
        queue2.add("Ali");
        queue2.add("Ahmet");
        queue2.add("Mehmet");

        printQueueWithPoll(queue2);

        System.out.println("---");

        printQueue(queue2);


    }

    public static void printQueue(Queue<?> queue) {
        for (Object o :
                queue) {
            System.out.println(o);
        }
    }

    public static void printQueueWithPoll(Queue<?> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.poll());
        }
    }
}
