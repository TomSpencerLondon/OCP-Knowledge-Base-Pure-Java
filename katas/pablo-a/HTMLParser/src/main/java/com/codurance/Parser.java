package com.codurance;

public class Parser {
  public HTMLNode parse(String input) throws InvalidHTMLException {
    if (input == null || input.isEmpty()) {
      throw new InvalidHTMLException();
    }
    
    return new HTMLNode();
  }
}
