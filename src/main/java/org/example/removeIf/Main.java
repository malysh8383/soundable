package org.example.removeIf;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Is");
        list.add("World");
        list.add("Hello");
        list.add("Book");
        list.add("He");

        System.out.println(list);

        list.removeIf(s -> s.length() < 4);
        System.out.println(list);
    }
}
