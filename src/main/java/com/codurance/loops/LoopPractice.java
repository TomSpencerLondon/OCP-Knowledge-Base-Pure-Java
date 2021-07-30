package com.codurance.loops;

public class LoopPractice {
  public static void main(String[] args) {
    crazyLoop();
  }

  static void crazyLoop() {
    var c = 0;

    JACK: while (c < 8) {
      JILL: System.out.println(c);
      if (c > 3) break JACK; else c++;
    }
  }
}
