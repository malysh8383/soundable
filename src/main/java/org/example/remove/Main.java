package org.example.remove;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("A");
        System.out.println(list);

        while (list.contains("A")) {
            list.remove("A");
        }

        System.out.println(list);
    }
}
