package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Task5 {
    public static String getLongestString(ArrayList<String> array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("red");
        color.add("yellow");
        color.add("pink");
        color.add("mustard");
        color.add("brown");
        color.add("white");
        color.add("purple");
        Collections.sort(color);
/*for(String i:color){
    System.out.println(i);*/
   // for (int i = 0; i < color.size(); i++) {
  //      System.out.println(color.get(i));
        String longestString = getLongestString(color);
        System.out.format("longest string: '%s'\n", longestString);
}}
