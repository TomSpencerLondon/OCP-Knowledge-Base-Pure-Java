package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

public abstract class AbstractVehicle implements Vehicle {
  private Engine engine;

  private Colour colour;

  public AbstractVehicle(Engine engine) {
    this(engine, UNPAINTED);
  }

  public AbstractVehicle(Engine engine, Colour colour) {
    this.engine = engine;
    this.colour = colour;
  }

  @Override
  public Engine getEngine() {
    return engine;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  public void paint(Colour colour){
    this.colour = colour;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
  }
}
