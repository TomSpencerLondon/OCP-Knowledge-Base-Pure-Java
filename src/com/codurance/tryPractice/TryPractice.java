package com.codurance.tryPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryPractice {
  public static void main(String[] args) throws IOException {
    try{
      var x = 1 / 0;
    } catch(Exception e) {
      System.out.println(e);
    }


    try {
      var h = "Hello";
    } catch (Exception e) {
      e.printStackTrace();
    }

    String string = firstLineOfFile(System.getProperty("user.dir")
        + "/src/com/codurance/tryPractice/hello.txt");

    System.out.println(string);
  }

  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      return br.readLine();
    }
  }
}
