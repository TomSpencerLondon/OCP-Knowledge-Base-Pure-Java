package com.codurance.ocppracticeexam;

public class TestClass {
  static int si = 10;
  public static void main (String args[]) {
    new TestClass();
    var ia = new int[][]{ {1, 2}, null};
  }

  public TestClass(){
    System.out.println(this);
  }
  public String toString() {
    return "TestClass.si = " + this.si;
  }
}



interface Eatable {
  int types = 10;
}

class Food implements Eatable {
  public static int types = 20;
}

//class Fruit extends Food implements Eatable { // LINE1
//
//  public static void main(String[] args) {
//    types = 38; // LINE2
//    System.out.println(types); // LINE 3
//  }
//}
