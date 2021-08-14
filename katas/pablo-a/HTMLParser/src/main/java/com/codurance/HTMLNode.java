package com.codurance;

import java.util.List;

public class HTMLNode implements Node {
  public List<Node> children() {
    return List.of(new HeadNode());
  }
}
