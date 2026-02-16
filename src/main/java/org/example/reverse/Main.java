package org.example.reverse;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("C#");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
