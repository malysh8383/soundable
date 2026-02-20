package org.example.removeAll;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}
