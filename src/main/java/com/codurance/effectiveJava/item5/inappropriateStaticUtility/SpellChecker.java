package com.codurance.effectiveJava.item5.inappropriateStaticUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellChecker {
    private static final Map dictionary = new HashMap<>();

    private SpellChecker(){}

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    };

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
}
