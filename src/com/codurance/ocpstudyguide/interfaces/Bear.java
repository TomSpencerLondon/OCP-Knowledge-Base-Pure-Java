package com.codurance.ocpstudyguide.interfaces;

public class Bear implements Herbivore, Omnivore {
  public int eatPlants(int quantity){
    System.out.println("Eating plans: " + quantity);
    return quantity;
  }

  public void eatPlants(){
    System.out.println("Eating plants");
  }
}
