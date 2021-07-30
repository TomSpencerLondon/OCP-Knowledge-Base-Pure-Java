package com.codurance.ocpstudyguide.staticversusinstance;

import java.sql.Ref;

public class ReferenceTypes {
  public void fly(String s) {
    System.out.print("string");
  }

  public void fly(Object o) {
    System.out.print("object");
  }

  // This prints string-object because
  // the first reference is to String
  // the second reference int which does not have
  // a direct reference - int is autoboxed to Integer
  // it then matches to Object because Object is a
  // parent reference of Integer
  public static void main(String[] args) {
    ReferenceTypes r = new ReferenceTypes();
    r.fly("test");
    System.out.print("-");
    r.fly(56);
  }
}
