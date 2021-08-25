package com.codurance.ocppracticeexam.exam1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    List<File> dir;
    public <R> List<R> executeFunction(Function<File, R> fun){
        List<R> l = new ArrayList<R>();
        for (File f : dir){
            l.add(fun.apply(f));
        }
        return l;
    }


}

