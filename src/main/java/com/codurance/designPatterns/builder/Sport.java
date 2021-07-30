package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.*;

public class Sport extends AbstractCar {

  public Sport(Engine engine) {
    this(engine, UNPAINTED);
  }

  public Sport(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
