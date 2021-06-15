package com.codurance.designPatterns.abstractFactory.chassis;

public class VanChassis implements Chassis {

  @Override
  public String getChassisParts() {
    return "Chassis parts for a van";
  }
}
