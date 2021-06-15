package com.codurance.designPatterns.abstractFactory;

import com.codurance.designPatterns.abstractFactory.body.Body;
import com.codurance.designPatterns.abstractFactory.body.CarBody;
import com.codurance.designPatterns.abstractFactory.chassis.CarChassis;
import com.codurance.designPatterns.abstractFactory.chassis.Chassis;
import com.codurance.designPatterns.abstractFactory.windows.CarWindows;
import com.codurance.designPatterns.abstractFactory.windows.Windows;

public class CarFactory extends AbstractVehicleFactory {

  @Override
  public Body createBody() {
    return new CarBody();
  }

  @Override
  public Chassis createChassis() {
    return new CarChassis();
  }

  @Override
  public Windows createWindows() {
    return new CarWindows();
  }
}
