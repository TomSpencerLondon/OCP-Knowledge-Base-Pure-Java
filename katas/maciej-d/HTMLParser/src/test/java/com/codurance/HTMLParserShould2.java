package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HTMLParserShould2 {
  private HTMLParser htmlParser;

  @BeforeEach
  void setUp() {
    htmlParser = new HTMLParser();
  }


  @Test
  void getsContentFromParagraph() {
    String content = htmlParser.findParagraph(
        "<p>hello</p>"
    );
    assertThat(content).isEqualTo("hello");
  }

  @Test
  void getsContentFromParagraphWithoutClosingParagraph() {
    String content = htmlParser.findParagraph(
        "<p>hello"
    );
    assertThat(content).isEqualTo("hello");
  }

  @Test
  void getsContentFromTwoParagraphs() {
    String content = htmlParser.findParagraph(
        "<p>hello</p>" +
             "<p>goodbye</p>"
    );
    assertThat(content).isEqualTo("hello goodbye");
  }
}
