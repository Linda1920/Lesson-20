package org.example;
import java.util.*;

class Product {
    private String name;

    public String getType() {
        return type;
    }

    private String type;
    public Product (String name, String type){
        this.name=name;
        this.type=type;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
public class Task2 {
    public static void main(String[] args)
    {HashMap<String, Product> toys = new HashMap<String, Product>();
        Product lego = new Product("Castle", "LEGO");
        Product camera= new Product("VTech Kidizoom", "Camera");
        Product toyDisney = new Product("Frog", "Disney toy");
        Product ship = new Product("Pirate Disney ship", "Disney toy");
        Product poppet = new Product("Cinderella", "Poppet");
        toys.put("Castle", lego);
        toys.put("VTech Kidizoom", camera);
        toys.put("Magic Frog", toyDisney);
        toys.put("Pirate ship", ship);
        toys.put("Cinderella", poppet);
        System.out.println("The set is: " + toys.entrySet());
        System.out.println("The name of toys: " + toys.keySet());
        System.out.println("The collection of toys is: " + toys.values());
    }
}