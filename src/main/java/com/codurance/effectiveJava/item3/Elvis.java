package com.codurance.effectiveJava.item3;

public class Elvis {
// singleton with public final field
//  public static final Elvis INSTANCE = new Elvis();
//  private Elvis(){}
//  public void leaveTheBuilding() {}

  private static final Elvis INSTANCE = new Elvis();
  private Elvis(){}
  public static Elvis getInstance() {return INSTANCE; };

  public void leaveTheBuilding(){};

  private Object readResolve(){
    // return the one true Elvis and let the garbage collector
    // take care of the Elvis impersonator
    return INSTANCE;
  }


}
