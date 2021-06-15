package com.codurance.designPatterns.builder;

public abstract class VehicleBuilder {
  public void buildBody() {}
  public void buildBoot() {}
  public void buildChassis() {}
  public void buildPassengerArea(){}
  public void buildReinforcedStorageArea(){}
  public void buildWindows(){}

  public abstract Vehicle getVehicle();
}
