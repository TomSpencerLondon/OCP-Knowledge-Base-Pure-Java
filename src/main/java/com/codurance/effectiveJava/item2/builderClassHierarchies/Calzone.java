package com.codurance.effectiveJava.item2.builderClassHierarchies;

public class Calzone extends Pizza {

  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Builder> {

    private boolean sauceInside = false; // default

    public Builder sauceInside() {
      sauceInside = true;
      return this;
    }

    @Override
    public Calzone build() {
      return new Calzone(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Calzone");
    stringBuilder.append(" with");
    if (sauceInside){
      stringBuilder.append(" sauce inside and");
    }
    toppings.forEach((topping) -> {
      stringBuilder.append(" ");
      stringBuilder.append(topping);
    });

    return stringBuilder.toString();
  }

  private Calzone(Builder builder) {
    super(builder);
    sauceInside = builder.sauceInside;
  }
}
