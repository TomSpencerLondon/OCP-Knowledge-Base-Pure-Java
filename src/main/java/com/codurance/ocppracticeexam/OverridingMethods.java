package com.codurance.ocppracticeexam;

public class OverridingMethods {

}

class A { }
class B extends A { }
class C extends B { }

class X {
  B getB() { return new B(); }
}

class Y extends X {
  // method declaration here
}
//
//  Which of the following methods can be inserted in class Y?
//    Please select 2 options
//    A. public C getB() { return new B(); }
//    B. protected B getB(){ return new C(); }
//    C. C getB() { return new C(); }
//    D. A getB { return new A(); }