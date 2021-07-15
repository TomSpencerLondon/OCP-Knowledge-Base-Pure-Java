package com.codurance.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Parser {
  static List<String> parse(String html){
    final String[] elements = html.split("<p>");

    List<String> result = new ArrayList<String>();

    for (String element : elements){
      result.add(element.replace("</p>", ""));
    }

    return result.stream()
        .filter(Objects::nonNull)
        .filter(Predicate.not(String::isEmpty))
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(parse("<p>hello</p><p>goodbye</p>"));
    System.out.println(parse("<p>hello<p>goodbye</p>"));
    System.out.println(parse("<p>hello<p>goodbye<p>hello again"));
  }
}
