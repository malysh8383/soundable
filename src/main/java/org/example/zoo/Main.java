package org.example.zoo;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Zoo zoo = new Zoo(new Soundable[]{cat, cow, dog});
        zoo.concert();

    }
}