package com.codurance.ocpstudyguide.classdesign.declaringconstructors;

public class Turtle {
  private String name;
  public Turtle() {
    name = "John Doe";
  }

  public Turtle(int age) {}
  public Turtle(String newName, String... favoriteFoods){
    name = newName;
  }

  public static void main(String[] args) {
    final Turtle turtle = new Turtle();
    System.out.println(turtle.toString());
  }
}
