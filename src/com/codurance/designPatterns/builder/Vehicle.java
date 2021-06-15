package com.codurance.designPatterns.builder;

public interface Vehicle {
  public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW};

  public Engine getEngine();
  public Colour getColour();
  public void paint(Colour colour);
}
