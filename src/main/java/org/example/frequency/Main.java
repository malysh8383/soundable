package org.example.frequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(1);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int c = Collections.frequency(list, n);
        System.out.println(c);
    }
}
