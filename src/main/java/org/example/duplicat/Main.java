package org.example.duplicat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> duplicates = new ArrayList();
        duplicates.add(1);
        duplicates.add(2);
        duplicates.add(1);
        duplicates.add(4);
        duplicates.add(2);
        duplicates.add(6);
        duplicates.add(4);
        duplicates.add(2);

        Set<Integer> duplicateSet = new HashSet();
        List<Integer> duplicateList = new ArrayList();
        for(Integer n : duplicates) {
            if(!duplicateSet.add(n)) {

                duplicateList.add(n);
            }
        }

        System.out.println(duplicateList);
    }
}
