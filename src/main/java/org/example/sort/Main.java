package org.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i <= 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
