package org.example.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(20);
        list.add(3);
        list.add(24);
        list.add(5);

        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
