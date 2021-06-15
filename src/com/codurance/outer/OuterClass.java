package com.codurance.outer;

public class OuterClass {
  String outerField = "Outer field";
  static String staticOuterField = "Static outer field";

  class InnerClass {
    void accessMembers() {
      System.out.println(outerField);
      System.out.println(staticOuterField);
    }
  }

  static class StaticNestedClass {
    String nonStatic = "nonStatic";

    void accessMembers(OuterClass outer) {
      // Compiler error: cannot make a static reference to the non-static
      // field outerField
      // System.out.println(outerField)
      // Non-static field 'outerField' cannot be referenced from a static context
//      System.out.println(outerField);

      System.out.println(outer.outerField);
      System.out.println(staticOuterField);
    }
  }

  static interface StaticNestedInterface {
    static String a = "ab";
  }

  public static void main(String[] args) {
    System.out.println("Inner class:");
    System.out.println("------------");
    OuterClass outerObject = new OuterClass();
    InnerClass innerObject = outerObject.new InnerClass();
    innerObject.accessMembers();
    
    System.out.println("\nStatic nested class:");
    System.out.println("----------------------");
    StaticNestedClass staticNestedObject = new StaticNestedClass();
    staticNestedObject.accessMembers(outerObject);

    System.out.println("\nTop-level class");
    System.out.println("-----------------");
    TopLevelClass topLevelObject = new TopLevelClass();
    topLevelObject.accessMembers(outerObject);
  }
}
