package com.codurance.ocpstudyguide.classdesign.overloadversusoverriding;

public class JavanRhino extends Rhino {
  public String getName(){
    return "javan rhino";
  }

//  'getColor()' in
//  'com.codurance.ocpstudyguide.classdesign.overloadversusoverriding.JavanRhino'
//  clashes with 'getColor()' in
//  'com.codurance.ocpstudyguide.classdesign.overloadversusoverriding.Rhino';
//  attempting to use incompatible return type
//  public CharSequence getColor(){ // does not compile
//    return "grey";
//  }
}
