package com.kodluyoruz.multithread.executors;

import java.util.concurrent.*;

public class MainExecutor {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(() -> {
//            System.out.println("Thread Name:" + Thread.currentThread().getName());
//        });
//        System.out.println("Thread Name:" + Thread.currentThread().getName());
//        executorService.submit(() -> {
//            System.out.println("Thread Name:" + Thread.currentThread().getName());
//        });

        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(10);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> integerFuture = service.submit(task);

        System.out.println("Is completed: " + integerFuture.isDone());
        Integer result = null;
        try {
            result = integerFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir sorun oluştu! Exception Message: " + e.getMessage());
        }

        System.out.println("Future done? " + integerFuture.isDone());
        System.out.println("Result: " + result);

        service.shutdown();

    }
}
