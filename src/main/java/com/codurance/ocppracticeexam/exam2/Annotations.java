package com.codurance.ocppracticeexam.exam2;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.function.Function;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
@Target(value={TYPE_USE,TYPE_PARAMETER})
@interface NonNull {
}

public class Annotations {
    public static void main(String[] args) {
        @NonNull String str = "";
        var str3 = (@NonNull String) "";
    }
}
