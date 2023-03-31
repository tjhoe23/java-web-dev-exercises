package org.launchcode.java.studios.coutingcharacters;

import java.util.HashMap;
import java.util.Map;


public class Loop {

    public static void main(String[] args) {
        String myString = "Hello World";

        //init string
        //loop through characters one at a time
        //data structure to store count
        //loop through data structure to print numbers
        //hashmap containsKey() for boolean


        HashMap<Character, Integer> numbers = new HashMap<Character, Integer>();

        char[] charactersInString = myString.toCharArray();

        for (char c : charactersInString) {
            if (numbers.containsKey(c)) {
                numbers.put(c, numbers.get(c) + 1);
            } else {
                numbers.put(c, 1);
            }
        }
//        for (Map.Entry<Character, Integer> c : numbers.entrySet()) {
//        System.out.println(c.getKey() + " " +  c.getValue());
//    }
        for (Map.Entry<Character, Integer> c : numbers.entrySet()) {
            System.out.println(c.getKey() + " " + c.getValue());
        }
    }
}


