package com.codurance.outer;

public class TopLevelClass {
  void accessMembers(OuterClass outer){
    // compiler error: cannot make a static reference to the non-static
    // field OuterClass.outerField
    // System.out.println(OuterClass.outerField)
    System.out.println(outer.outerField);
    System.out.println(OuterClass.staticOuterField);
  }

  class A {
  }

  static class B {
  }

  public static void main(String[] args) {
    TopLevelClass topLevelClass = new TopLevelClass();
    A a1 = topLevelClass.new A();
    A a2 = topLevelClass.new A();
    A a3 = topLevelClass.new A();

    B b = new B();
    B b2 = new B();
  }
}
