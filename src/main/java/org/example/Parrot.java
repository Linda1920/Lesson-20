package org.example;

public class Parrot extends Pet{
    public Parrot(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "breed='" + breed + '\'' +
                '}';
    }

    String breed;
}
