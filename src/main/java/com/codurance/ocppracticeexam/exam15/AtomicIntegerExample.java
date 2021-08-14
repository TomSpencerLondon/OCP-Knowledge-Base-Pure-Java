package com.codurance.ocppracticeexam.exam15;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
  public static void main(String[] args) {
    AtomicInteger ai = new AtomicInteger(5);
//    int x = ai.getAndIncrement();
    int x = ai.addAndGet(1);
//    int x = ai.incrementAndGet();
    System.out.println(x);

//    Please select 2 options
//    A. int x = ai.increment();
//    B. int x = ai.getAndIncrement();
//    C. int x = ai + 1;
//    D. int x = ai.incrementAndGet();
//    E. int x = ai.addAndGet(1);
//    F. int x = ai.getAndSet(6);

  }
}
