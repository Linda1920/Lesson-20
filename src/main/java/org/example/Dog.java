package org.example;

public class Dog extends Pet{
    public String getSize() {
        return size;
    }

    public Dog(String name, String type, String size) {
        super(name, type);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                '}';
    }

    String size;
}
