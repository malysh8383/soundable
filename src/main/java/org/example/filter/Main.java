package org.example.filter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                n1.add(i);

            } else {
                n2.add(i);
            }


        }

        System.out.println("Четные числа:" + n1);
        System.out.println("Нечетные числа:" + n2);
    }
}
