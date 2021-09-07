package com.codurance.ocppracticeexam.exam2;

public class TestClass2 {
  public static void main(String[] args) throws Exception {
    TestClass2 tc = new TestClass2();
    tc.myMethod();
  }

  public void myMethod() throws Exception {
    yourMethod();
  }

  public void yourMethod() throws Exception {
    throw new Exception();
  }
}

