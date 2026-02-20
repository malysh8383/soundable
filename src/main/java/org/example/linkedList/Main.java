package org.example.linkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        while (!list.isEmpty()) {
            System.out.println(list.removeFirst());
        }

        System.out.println(list.isEmpty());

    }
}
