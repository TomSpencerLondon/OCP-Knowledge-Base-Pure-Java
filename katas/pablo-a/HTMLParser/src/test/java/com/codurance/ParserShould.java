package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ParserShould {
  @Test
  void throw_invalid_html_exception_for_null() {
    final Parser parser = new Parser();

    assertThrows(InvalidHTMLException.class, () -> {
      parser.parse(null);
    });
  }

  @Test
  void throw_invalid_html_exception_for_empty_string() {
    final Parser parser = new Parser();

    assertThrows(InvalidHTMLException.class, () -> {
      parser.parse("");
    });
  }

  @Test
  void html_with_root_html_node_returns_html_node() throws InvalidHTMLException {
    final Parser parser = new Parser();
    assertThat(parser.parse("<html></html>")).isInstanceOf(HTMLNode.class);
  }

  @Test
  void html_tag_with_head_tag_returns_html_with_head_tag_as_only_html_node() throws InvalidHTMLException {
    final Parser parser = new Parser();
    assertThat(parser.parse("<html><head></head></html>")).isInstanceOf(HTMLNode.class);
    assertThat(parser.parse("<html><head></head></html>").children().get(0)).isInstanceOf(HeadNode.class);
  }

  //<html>
//  <head>
//    <meta charset="utf-8">
//    <title></title>
//  </head>
//  <body>
//
//  </body>
//</html>
}
