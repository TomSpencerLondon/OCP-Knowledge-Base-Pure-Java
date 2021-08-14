package com.codurance.ocppracticeexam.exam15;
import java.io.*;
public class TestClass4 {
  public static void main(String[] args) throws Exception {
    try(var bfr = new BufferedReader(new InputStreamReader(System.in))){
      System.out.println("Enter Number:");
      var s = bfr.readLine();
      System.out.println("Your Number is : " + s);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
