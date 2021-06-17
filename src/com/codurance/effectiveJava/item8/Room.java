package com.codurance.effectiveJava.item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
  private static final Cleaner cleaner = Cleaner.create();

  private static class State implements Runnable {
    int numJunkPiles;

    State(int numJunkPiles){
      this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void run() {
      System.out.println("Cleaning room");
      numJunkPiles = 0;
    }
  }


  // The state of this room, shared with our cleanable
  private final State state;

  // Our cleanable. Cleans the room when it's eligible for gc
  private final Cleaner.Cleanable cleanable;

  public Room(int numJunkPiles) {
    state = new State(numJunkPiles);
    cleanable = cleaner.register(this, state);
  }


  @Override
  public void close() {
    cleanable.clean();
  }
}
