package com.codurance.interfaces;

public class MyRunnable implements Runnable {
  @Override
  public void run() {

  }

  public static void main(String[] args) {
    Runnable myRunnable = new MyRunnable();
    Runnable myRunnable2 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Running 2");
      }
    };

    myRunnable.run();
    myRunnable2.run();
  }
}
