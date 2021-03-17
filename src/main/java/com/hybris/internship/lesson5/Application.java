package com.hybris.internship.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Brave", "'Brave' definition");
        dictionary.put("Brilliant", "'Brilliant' definition");
        dictionary.put("Joy", "'Joy' definition");
        dictionary.put("Confidence", "'Confidence' definition");

        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }
        System.out.println("---------------------------------------");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("---------------------------------------");

        LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<>();
        dictionary1.put("Brave", "'Brave' definition");
        dictionary1.put("Brilliant", "'Brilliant' definition");
        dictionary1.put("Joy", "'Joy' definition");
        dictionary1.put("Confidence", "'Confidence' definition");

        for (String word : dictionary1.keySet()) {
            System.out.println(word);
            System.out.println(dictionary1.get(word));
        }
        System.out.println("---------------------------------------");

        TreeMap<String, String> dictionary2 = new TreeMap<>();
        dictionary2.put("Brave", "'Brave' definition");
        dictionary2.put("Brilliant", "'Brilliant' definition");
        dictionary2.put("Joy", "'Joy' definition");
        dictionary2.put("Confidence", "'Confidence' definition");

        for (String word : dictionary2.keySet()) {
            System.out.println(word);
            System.out.println(dictionary2.get(word));

        }
        System.out.println("---------------------------------------");

    }
}
