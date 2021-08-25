
package com.codurance.ocppracticeexam.exam1;

import java.io.File;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestAccessController2 {
    public static void main(String[] args) {

        TestAccessController2 testAccessController2 = new TestAccessController2();
        testAccessController2.dir = List.of(new File("/tmp/test1.txt"));
        System.out.println(testAccessController2.executeFunction(new Function<File, Boolean>() {
            public Boolean apply(File o) {
                System.out.println(o.getAbsolutePath());
                System.out.println(o.exists());
                return o.delete();
            }
        }));
    }

    List<File> dir;

    public <R> List<R> executeFunction(Function<File, R> fun) {
        List<R> l = new ArrayList<R>();
        for (File f : dir) {
            l.add(fun.apply(f));
        }
        return l;
    }
}