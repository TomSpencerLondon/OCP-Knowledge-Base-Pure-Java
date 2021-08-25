package com.codurance.ocppracticeexam.exam1;

class SuperClass {
  public SuperClass(int m) {}
  public SuperClass(){}
}

public class SubClass extends SuperClass {
  int i, j, k;
  public SubClass(int m, int n) { i = m; j = m; } // 1
  public SubClass(int m) { super(m ); }
}
