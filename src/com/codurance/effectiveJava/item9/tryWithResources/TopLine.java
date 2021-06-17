package com.codurance.effectiveJava.item9.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
  // try-with-resources - the best way to close resources

  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))){
      return br.readLine();
    }
  }
}
