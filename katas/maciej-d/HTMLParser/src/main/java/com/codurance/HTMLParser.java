package com.codurance;

public class HTMLParser {
  public String findParagraph(String html) {
    int index1 = html.indexOf("<p>");
    int index2 = html.indexOf("</p>", index1);

    // Failing test - write utility class
    // to count number of paragraphs in a string
    // use this number to iterate over the paragraphs.
    if (index2 != -1){
      return html.substring(index1 + 3, index2);
    }else {
      return html.substring(index1 + 3);
    }

  }
}
