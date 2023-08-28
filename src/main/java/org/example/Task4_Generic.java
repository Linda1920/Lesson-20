package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task4_Generic<T>{
    private ArrayList<T> userData= new ArrayList<>();
    public void addData(T data){
        userData.add(data);
    }
    public void printData (){
        for (T u: userData){
            System.out.println(u);
        }
    }
    public static void main(String[] args){
        Task4_Generic<Object> generic=new Task4_Generic<>();
        generic.addData ("Nancy");
        generic.addData ("1234");
        generic.addData  ("Marry");
        generic.addData ("Anry");
        generic.addData ("Yona");
        generic.addData ("1234");
        generic.addData ("Nancy");
        System.out.println("Original data:");
        generic.printData();

        generic.removeDuplicates();
        }

   public void removeDuplicates(){
    ArrayList<T> newList = userData.stream()
            .distinct()
            .collect(Collectors.toCollection(ArrayList::new));
    userData=newList;
System.out.println("Data after removing duplicates:"+ newList);

    }}

