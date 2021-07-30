package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

public class Pickup extends AbstractVan {
  public Pickup(Engine engine) {
    this(engine, UNPAINTED);
  }

  public Pickup(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
