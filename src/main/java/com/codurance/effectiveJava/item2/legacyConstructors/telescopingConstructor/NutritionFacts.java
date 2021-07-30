package com.codurance.effectiveJava.item2.legacyConstructors.telescopingConstructor;

public class NutritionFacts {

  private int servingSize; // (ml) required
  private int servings; // (per container) required
  private int calories; // (per serving) optional
  private int fat; // (g/serving) optional
  private int sodium; // (mg/serving) optional
  private final int carbohyrate;
  private int carbohydrate; // (g/serving) optional

  public NutritionFacts(int servingSize, int servings){
    this(servingSize, servings, 0);
  }

  public NutritionFacts(int servingSize, int servings, int calories){
    this(servingSize, servings, calories, 0);
  }

  public NutritionFacts(int servingSize, int servings, int calories, int fat) {
    this(servingSize, servings, calories, fat, 0);
  }

  public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
    this(servingSize, servings, calories, fat, sodium, 0);
  }

  public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
    this.servingSize = servingSize;
    this.servings = servings;
    this.calories = calories;
    this.fat = fat;
    this.sodium = sodium;
    this.carbohyrate = carbohydrate;
  }

  public static void main(String[] args) {
    NutritionFacts cocacola = new NutritionFacts(240, 8, 100, 0, 35, 27);
  }
}
