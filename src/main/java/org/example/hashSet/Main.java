package org.example.hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        Set<Character> wordSet = new HashSet<Character>();
        for(char c : word.toCharArray()){
            wordSet.add(c);
        }
        System.out.println(wordSet.size());
        System.out.println(wordSet);
    }
}
