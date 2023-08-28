package org.example;
import java.util.HashMap;
public class Task3 {
    public static void main(String[] args) {
        Pet dog=new Dog("Totoshka", "dog","small" );
        Pet cat= new Cat("Gerry", "cat","ginger");
        Pet parrot=new Parrot("Rorry", "parrot", "Jaco");
        Pet dog1=new Dog("Rich", "dog","big" );
        Pet cat1= new Cat("Archy", "cat","white");
        Pet parrot1=new Parrot("Corry", "parrot", "Kakadu");

    HashMap<String, Pet> animals = new HashMap<>();

        animals.put(dog.getName(), dog);
        animals.put(cat.getName(), cat);
        animals.put(parrot.getName(), parrot);
        animals.put(dog1.getName(), dog);
        animals.put(cat1.getName(), cat);
        animals.put(parrot1.getName(), parrot);
        System.out.println("Print pets names: ");
        for (String i : animals.keySet()) {
            System.out.println(i);
        }
}}
