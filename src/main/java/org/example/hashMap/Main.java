package org.example.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("day");
        list.add("book");
        list.add("day");
        list.add("we");
        list.add("day");
        list.add("book");

        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String s : list) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }
        System.out.println(map);

        String max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(max);
    }
}
