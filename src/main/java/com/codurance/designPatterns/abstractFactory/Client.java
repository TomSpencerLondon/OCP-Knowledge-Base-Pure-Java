package com.codurance.designPatterns.abstractFactory;

import com.codurance.designPatterns.abstractFactory.body.Body;
import com.codurance.designPatterns.abstractFactory.chassis.Chassis;
import com.codurance.designPatterns.abstractFactory.windows.Windows;

public class Client {
  public static void main(String[] args) {
    String whatToMake = "car"; // can also be van
    AbstractVehicleFactory factory = null;

    // Create the correct 'factory'...
    if (whatToMake.equals("car")){
      factory = new CarFactory();
    }else {
      factory = new VanFactory();
    }

    // Create the vehicle's component parts...
    // These will be either all car parts or all van parts.
    Body vehicleBody = factory.createBody();
    Chassis vehicleChassis = factory.createChassis();
    Windows vehicleWindows = factory.createWindows();

    // Show what we created...
    System.out.println(vehicleBody.getBodyParts());
    System.out.println(vehicleChassis.getChassisParts());
    System.out.println(vehicleWindows.getWindowParts());
  }
  // client program needs to know if it is making car or a van,
  // but once it has instantiated the correct factory all the
  // methods to create the parts can be done using an identical
  // set of method calls.

  // The main disadvantage of the Abstract Factory pattern arises if
  // you need to add additional 'products'. For example, if we now
  // need to include Lights in the family of components, we would need to
  // amend AbstractVehicleFactory, CarFactory, and VanFactory, in addition
  // to creating a new Lights hierarchy (CarLights and VanLights)
}
