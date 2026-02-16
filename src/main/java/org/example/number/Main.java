package org.example.number;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)  == 5) {
                numbers.set(i, 10);
            }

        }
        System.out.println(numbers);
    }
}
