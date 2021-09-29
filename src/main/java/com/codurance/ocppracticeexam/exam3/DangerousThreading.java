package com.codurance.ocppracticeexam.exam3;

public class DangerousThreading {
    public static void main(String[] args) throws InterruptedException {
        Data2 data = new Data2();
        for (int i = 0; i < 100; i++) {
            threading(data);
        }

        Thread.sleep(5000);
        System.out.println(data.getData());
    }

    private static void threading(Data2 data) {
        new Thread("Thread 1") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    data.setData(data.getData() + 1);
                }
            }
        }.start();

        new Thread("Thread 2") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    data.setData(data.getData() + 2);
                }
            }
        }.start();

        new Thread("Thread 3") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    data.setData(data.getData() + 3);
                }
            }
        }.start();
    }
}

