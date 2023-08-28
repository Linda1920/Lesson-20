package org.example;

public class Cat extends Pet{
    public Cat(String name, String type, String colour) {
        super(name, type);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                '}';
    }

    String colour;

}
