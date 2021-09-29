package com.codurance.ocppracticeexam.exam3;

public class Thread2 {
    public static void main(String[] args) {
        Object lock = new Object();
        Data2 data = new Data2();
        new Thread("Thread 1"){
            @Override
            public void run(){
                synchronized (lock){
                    System.out.println("I'm " + currentThread().getName());
                    data.print();
                }
            }
        }.start();

        new Thread("Thread 2"){
            @Override
            public void run(){
                synchronized (lock){
                    System.out.println("I'm " + currentThread().getName());
                    data.print();
                }
            }
        }.start();

    }
}
