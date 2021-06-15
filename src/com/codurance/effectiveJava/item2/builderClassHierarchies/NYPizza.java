package com.codurance.effectiveJava.item2.builderClassHierarchies;

import java.util.Objects;

public class NYPizza extends Pizza {
  public enum Size { SMALL, MEDIUM, LARGE }
  private final Size size;

  public static class Builder extends Pizza.Builder<Builder> {
    private final Size size;

    public Builder(Size size){
      this.size = Objects.requireNonNull(size);
    }

    @Override
    NYPizza build() {
      return new NYPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(size);
    stringBuilder.append(" NY Pizza");
    stringBuilder.append(" with");
    toppings.forEach((topping) -> {
      stringBuilder.append(" ");
      stringBuilder.append(topping);
    });

    return stringBuilder.toString();
  }

  private NYPizza(Builder builder) {
    super(builder);
    size = builder.size;
  }
}
