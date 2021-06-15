package com.codurance.designPatterns.abstractFactory;

import com.codurance.designPatterns.abstractFactory.body.Body;
import com.codurance.designPatterns.abstractFactory.chassis.Chassis;
import com.codurance.designPatterns.abstractFactory.windows.Windows;

public abstract class AbstractVehicleFactory {
  public abstract Body createBody();
  public abstract Chassis createChassis();
  public abstract Windows createWindows();
}
