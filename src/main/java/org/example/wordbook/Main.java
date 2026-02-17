package org.example.wordbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();


        var dict = new HashMap<String, String>();
        dict.put("яблоко", "apple");
        dict.put("слово", "word");
        dict.put("словарь", "wordbook");
        dict.put("день", "day");
        dict.put("имя", "name");
        dict.put("фамилия", "surname");
        dict.put("мама", "mother");

        if (dict.containsKey(word)) {
            System.out.println(dict.get(word));
        }
        else{
            System.out.println("Такого слова в словаре не существует");
        }

    }
}
