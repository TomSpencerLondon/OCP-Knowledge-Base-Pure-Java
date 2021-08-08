package com.codurance.ocppracticeexam;

public class CastTest {
  public static void main(String[] args) {
    byte b = -128;
    int i = b;
    b = (byte) i;
    System.out.println(i + " " + b);
  }
}

//
//  Please select 1 option
//    A. The compiler will refuse to compile it because i and b are of different types cannot be assigned to each other.
//    B. The program will compile and print -128 and -128 when run .
//    C. The compiler will refuse to compile it because -128 is outside the range of values for a byte.
//    D. The program will compile and will print 128 and -128 when run .
//    E. The program will compile and will print 255 and -128 when run .

