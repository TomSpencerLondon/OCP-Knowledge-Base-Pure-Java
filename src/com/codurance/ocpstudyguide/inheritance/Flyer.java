package com.codurance.ocpstudyguide.inheritance;

interface Flyer { String getName(); }

class Bird implements Flyer {
  protected String name;
  public Bird() { }

  public Bird(String name){
    this.name = name;
  }

  public Bird(String name, String color){
    this.name = name;
  }

  public String getName() { return name; }

}

class Eagle extends Bird {
  public Eagle(String name){
    super(name, "red");
  }
}

class TestClass {
  public static void main(String[] args) throws Exception {
    Flyer f = new Eagle("American Bald Eagle");
    System.out.println(f.getName());
    System.out.println(((Eagle) f).name);
    System.out.println(((Bird) f).getName());
  }
}