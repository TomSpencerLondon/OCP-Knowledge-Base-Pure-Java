package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HTMLParserShould {
  HTMLParser htmlParser;

  @BeforeEach
  void setUp() {
    htmlParser = new HTMLParser();
  }

  @Test
  void getsContentFromParagraph() {

    String content = htmlParser.findParagraph("<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <p>hello</p>\n" +
        "</body>\n" +
        "</html>");
    assertThat(content).isEqualTo("hello");
  }

  @Test
  void getsContentFromTwoParagraphs() {

    String content = htmlParser.findParagraph("<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <p>good morning</p>\n" +
        "    <p>good afternoon</p>\n" +
        "</body>\n" +
        "</html>");

    assertThat(content).isEqualTo("good morning\ngood afternoon");
  }

  @Test
  void getsContentFromThreeParagraphs() {
    String content = htmlParser.findParagraph("<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <p>good morning</p>\n" +
        "    <p>good afternoon</p>\n" +
        "    <p>good evening</p>\n" +
        "</body>\n" +
        "</html>");

    assertThat(content).isEqualTo("good morning\ngood afternoon\ngood evening");
  }

  @Test
  void returns_paragraphsEvenIfOneParagraphDoesNotSelfClose() {
    String content = htmlParser.findParagraph("<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <p>good morning\n" +
        "    <p>good afternoon</p>\n" +
        "    <p>good evening</p>\n" +
        "</body>\n" +
        "</html>");

    assertThat(content).isEqualTo("good morning\ngood afternoon\ngood evening");

  }
}
