package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.UNPAINTED;

import com.codurance.designPatterns.builder.Vehicle.Colour;

public class BoxVan extends AbstractVan {
  public BoxVan(Engine engine){
    this(engine, UNPAINTED);
  }

  public BoxVan(Engine engine, Colour colour){
    super(engine, colour);
  }
}
