package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

import com.codurance.designPatterns.builder.Vehicle.Colour;

public abstract class AbstractVan extends AbstractVehicle {

  public AbstractVan(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractVan(Engine engine, Colour colour) {
    super(engine, colour);
  }
}