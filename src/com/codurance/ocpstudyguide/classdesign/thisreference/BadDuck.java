package com.codurance.ocpstudyguide.classdesign.thisreference;

public class BadDuck {
  private String color;
  private int height;
  private int length;

  public void setData(int length, int theHeight) {
//    length = this.length; // backwards - no good
    height = theHeight; // good because different name
    this.color = "white"; // this not necessary - fine though
  }

  public static void main(String[] args) {
    final BadDuck badDuck = new BadDuck();
    badDuck.setData(1,2);
    System.out.println(badDuck.length + " " + badDuck.height + " " + badDuck.color);
  }
}
