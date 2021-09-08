package com.codurance.ocppracticeexam.exam2;

import java.util.Arrays;
import java.util.List;

public class MyProcessor {
  Integer value;
  public MyProcessor(Integer value){
    this.value = value;
  }

  public void process(){
    System.out.println(value + " ");
  }
}

class TestClass5 {
  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(1, 2, 3);

    ls.stream()
        .map(MyProcessor::new)
        .forEach(MyProcessor::process);


    ls.stream()
        .map((x) -> new MyProcessor(x))
        .forEach((myProcessor) -> myProcessor.process());
  }
}
