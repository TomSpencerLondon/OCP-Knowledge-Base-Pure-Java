package com.codurance.ocppracticeexam.exam1;

import java.io.*;

public class MarkTest {
  public static void main(String[] args) {
    try (Reader r = new BufferedReader(new FileReader("src/resources/test.txt"))){
      if (r.markSupported()) {
        BufferedReader in = (BufferedReader) r;
        System.out.println(in.readLine());
        in.mark(100);
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        in.reset();
        System.out.println(in.readLine());
        in.reset();
        System.out.println(in.readLine());
      } else {
        System.out.println("Mark Not Supported");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
