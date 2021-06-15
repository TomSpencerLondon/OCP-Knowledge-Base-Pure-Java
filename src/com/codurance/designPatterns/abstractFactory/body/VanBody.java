package com.codurance.designPatterns.abstractFactory.body;

import com.codurance.designPatterns.abstractFactory.body.Body;

public class VanBody implements Body {

  @Override
  public String getBodyParts() {
    return "Body shell parts for a van";
  }
}
