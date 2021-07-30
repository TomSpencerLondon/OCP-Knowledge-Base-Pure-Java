package com.codurance.effectiveJava.item9.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TopLineWithDefault {
  // try-with-resources with a catch clause
  static String firstLineOfFile(String path, String defaultVal){
    try(BufferedReader br = new BufferedReader(new FileReader(path))){
      return br.readLine();
    } catch (IOException e) {
      return defaultVal;
    }
  }

  public static void main(String[] args) {
    Path configPath = Paths.get(System.getProperty("user.home") + "/Desktop/OCP-KnowledgeBase-nonGradle/resources/hello.txt");
    System.out.println(configPath);
    System.out.println(firstLineOfFile(configPath.toString(), "Toppy McTopFace"));
  }
}
