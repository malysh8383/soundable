package org.example.randomNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        int a;

        for (int i = 0; i <= 15; i++) {
            numbers.add(rand.nextInt(100));
        }

        a = Collections.max(numbers) - Collections.min(numbers);

        System.out.println(numbers);
        Collections.max(numbers);
        Collections.min(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println(a);


    }
}
