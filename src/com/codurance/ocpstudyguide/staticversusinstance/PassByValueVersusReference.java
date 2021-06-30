package com.codurance.ocpstudyguide.staticversusinstance;

public class PassByValueVersusReference {
  // This uses pass by value;
  public static void main(String[] args) {
    int original1 = 1;
    int original2 = 2;
    swap(original1, original2);
    System.out.println(original1);
    System.out.println(original2);
  }

  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
  }

  // This is a made up language with pass by reference
  /*
  original1 = 1;
  original2 = 2;
  swapByReference(original1, original2);
  print(original1); // 2 (not in Java)
  print(original2); // 1 (not in Java)

  swapByReference(a, b) {
    temp = a;
    a = b;
    b = temp;
  }
   */
  // In this made up language the caller is affected
  // by variable assignments made in the method.

}
