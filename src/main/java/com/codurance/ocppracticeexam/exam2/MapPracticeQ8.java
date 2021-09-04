package com.codurance.ocppracticeexam.exam2;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPracticeQ8 {
    public static void main(String[] args) {
        List<String> keys = List.of("a"); // 1
        Map<String, String> map = new TreeMap<>(); // 3

        int i = 0;
        for (var key : keys){
            map.put(key, "-----");
        }
        System.out.println(keys+ " " + map.size());

    }
}
