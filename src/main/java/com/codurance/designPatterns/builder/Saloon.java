package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

public class Saloon extends AbstractCar {

  public Saloon(Engine engine) {
    this(engine, UNPAINTED);
  }

  public Saloon(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
