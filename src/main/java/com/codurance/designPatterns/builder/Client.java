package com.codurance.designPatterns.builder;

import static com.codurance.designPatterns.builder.Vehicle.Colour.RED;
import static com.codurance.designPatterns.builder.Vehicle.Colour.WHITE;

public class Client {
  // Sample engines...
  public static void main(String[] args) {
    Engine engine1 = new StandardEngine(1300);
    Engine engine2 = new TurboEngine(2000);

    System.out.println(engine1);
    System.out.println(engine2);

    // sample vehicles...
    Vehicle car = new Saloon(engine1, RED);
    Vehicle van = new BoxVan(engine2, WHITE);

    System.out.println(car);
    System.out.println(van);
  }
}
