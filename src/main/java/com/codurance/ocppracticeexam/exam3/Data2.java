package com.codurance.ocppracticeexam.exam3;

public class Data2 {
    public long data = 0L;

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public synchronized void print() {
        System.out.println("Print 1 " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception ex){
        }
        System.out.println("Print 2 " + Thread.currentThread().getName());
    }
}
