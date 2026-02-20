package org.example.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Илья",27));
        people.add(new Person("Никита",25));
        people.add(new Person("Кирилл",22));
        people.add(new Person("Павел",17));
        people.add(new Person("Алексей",18));
        people.add(new Person("Иван",19));

        people.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .forEach(System.out::println);

    }
}
