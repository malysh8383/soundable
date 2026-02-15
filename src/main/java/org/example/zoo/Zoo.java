package org.example.zoo;

public class Zoo {
    private Soundable[] animals;

    public Zoo(Soundable[] animals) {
        this.animals = animals;
    }

    public void concert() {
        for (Soundable animal : animals) {
            animal.makeSound();
        }
    }
}
