package com.codurance.ocppracticeexam.exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamPactice {
  public static void main(String[] args) {
    FileInputStream tempFis = null;
    File file = new File("src/resources/test.txt");
    System.out.println(file.getAbsoluteFile());

    try(FileInputStream fis = new FileInputStream(file)){
      System.out.println(fis);
      tempFis = fis;
    } catch (IOException | NullPointerException e) {
      e.printStackTrace();
    }
  }
}
