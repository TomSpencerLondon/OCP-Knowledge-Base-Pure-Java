package com.codurance.effectiveJava.item5.inappropriateSingleton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellChecker {
    private final Map dictionary = new HashMap<>();
    private SpellChecker(){ }
    public static SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
}
