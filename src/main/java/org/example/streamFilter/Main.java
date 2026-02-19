package org.example.streamFilter;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        Stream<Integer> stream = numbers.stream();
        stream.filter(i -> i < 10).forEach(System.out::println);
    }
}
