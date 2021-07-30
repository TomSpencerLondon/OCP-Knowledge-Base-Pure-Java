package com.codurance.ocpstudyguide.classdesign.defaultconstructor;

public class RabbitsMultiply {
  public static void main(String[] args) {
    Rabbit1 rabbit1 = new Rabbit1();
    Rabbit2 rabbit2 = new Rabbit2();
    Rabbit3 rabbit3 = new Rabbit3(true);

    // Rabbit4 does not compile because the constructor is private
    // this means that other classes cannot call new Rabbit4()
//    Rabbit4 rabbit4 = new Rabbit4();

  }
}
