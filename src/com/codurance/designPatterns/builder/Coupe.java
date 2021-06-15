package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

public class Coupe extends AbstractCar {

  public Coupe(Engine engine) {
    super(engine, UNPAINTED);
  }

  public Coupe(Engine engine, Colour colour){
    super(engine, colour);
  }
}
