package org.example;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Task1 {
    public static void main (String[] args){
        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
    }

}
