package com.codurance.ocpstudyguide.staticversusinstance;

public class Glider2 {
  public static String glide(String s) {
    return "1";
  }

  public static String glide(String... s) {
    return "2";
  }

  public static String glide(Object o) {
    return "3";
  }

  public static String glide(String s, String t){
    return "4";
  }

  // this prints 142
  // The first call uses String s - direct match
  // The second call uses String s, String t - direct match
  // The final call uses Varargs as last option

  // The order of matching for overloaded methods is:
  // 1. Exact match by type
  // 2. Larger primitive type
  // 3. Autoboxed type
  // 4. Varargs
  public static void main(String[] args) {
    System.out.print(glide("a"));
    System.out.print(glide("a", "b"));
    System.out.print(glide("a", "b", "c"));
  }
}
