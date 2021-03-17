package com.hybris.internship.lesson1;


import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("there");
        words.add("10");

        String item1 = words.get(2);
        System.out.println(item1);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(100);

        numbers.remove(2);
        numbers.removeFirst();

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

