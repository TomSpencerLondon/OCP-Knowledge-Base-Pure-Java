package com.codurance.ocppracticeexam.exam2;

public class FunWithArgs {
  public static void main (String[][] args){
    System.out.println(args[0][1]);
  }

  public static void main(String[] args) {
    var fwa = new FunWithArgs();
    String[][] newArgs = {args};
    fwa.main(newArgs);
  }
}
