package com.codurance.designPatterns.builder;

public class StandardEngine extends AbstractEngine {

  public StandardEngine(int size) {
    super(size, false);
  }

  @Override
  public int getSize() {
    return 0;
  }

  @Override
  public boolean isTurbo() {
    return false;
  }
}
