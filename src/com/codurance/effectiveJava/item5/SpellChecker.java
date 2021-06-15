package com.codurance.effectiveJava.item5;

import static java.util.Objects.*;

import java.util.List;
import java.util.Objects;

public class SpellChecker {
    public Lexicon dictionary;

//    public SpellChecker(Lexicon dictionary){
//      this.dictionary = requireNonNull(dictionary);
//    }

    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
}
