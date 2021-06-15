package com.codurance.designPatterns.abstractFactory.body;

public class CarBody implements Body {

  @Override
  public String getBodyParts() {
    return "Body shell parts for a car";
  }
}
