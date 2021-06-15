package com.codurance.designPatterns.abstractFactory;

import com.codurance.designPatterns.abstractFactory.body.Body;
import com.codurance.designPatterns.abstractFactory.body.VanBody;
import com.codurance.designPatterns.abstractFactory.chassis.Chassis;
import com.codurance.designPatterns.abstractFactory.chassis.VanChassis;
import com.codurance.designPatterns.abstractFactory.windows.VanWindows;
import com.codurance.designPatterns.abstractFactory.windows.Windows;

public class VanFactory extends AbstractVehicleFactory {

  @Override
  public Body createBody() {
    return new VanBody();
  }

  @Override
  public Chassis createChassis() {
    return new VanChassis();
  }

  @Override
  public Windows createWindows() {
    return new VanWindows();
  }
}
