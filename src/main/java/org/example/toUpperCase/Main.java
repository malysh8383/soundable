package org.example.toUpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("day");
        list.add("you");

        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCase);

    }
}
