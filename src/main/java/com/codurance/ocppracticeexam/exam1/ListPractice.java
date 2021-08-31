package com.codurance.ocppracticeexam.exam1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPractice {
    public static void main(String[] args) {

    }
}

class Dumper {
//    Map<String, List<String>> box = new HashMap<String, List<String>>();
    HashMap<?, List<String>> box = new HashMap<String, List<String>>();

    public void dumpStuff(){
        for(List<String> l : box.values()){
            System.out.println(l);
        }
    }
}
