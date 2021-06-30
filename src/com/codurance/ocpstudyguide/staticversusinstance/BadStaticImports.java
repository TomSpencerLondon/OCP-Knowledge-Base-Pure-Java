package com.codurance.ocpstudyguide.staticversusinstance;

//Cannot resolve symbol 'Arrays'
//import static java.util.Arrays;

import static java.util.Arrays.asList;

//'class' or 'interface' expected
//static import java.util.Arrays.*;

public class BadStaticImports {
  public static void main(String[] args) {
    asList("one");
  }
}
