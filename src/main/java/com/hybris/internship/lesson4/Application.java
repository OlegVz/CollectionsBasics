package com.hybris.internship.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(67);
        newList.add(15);

//        list1.addAll(newList);
//        System.out.println(list1);
//
//        list1.removeAll(newList);
//        System.out.println(list1);
//
//        boolean contains = list1.contains(67);
//        System.out.println(contains);
//
//        list1.clear();
//        System.out.println(list1);
//
//        System.out.println(list1.isEmpty());

        list1.retainAll(newList);
        System.out.println(list1);

        HashSet<Integer> list2 = new HashSet<>();
        list2.add(12);
        list2.add(43);
        list2.add(15);
        list2.add(67);
        list2.add(43);
        list2.add(10);
        list2.add(10);
        list2.add(10);

        List<Integer> li = new ArrayList<>(list2);
        System.out.println(li);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);

        ArrayList<Integer> myList = new ArrayList<>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Random");
        hashSet1.add("Tooth Brash");
        hashSet1.add("Computer");
        hashSet1.add("Cloths");

        ArrayList<String> myList1 = new ArrayList<>(hashSet1);
        Collections.sort(myList1);
        System.out.println(myList1);

        HashSet<Employee> hashSet2 = new HashSet<>();
        hashSet2.add(new Employee("Mike", 3500, "Accountant"));
        hashSet2.add(new Employee("Paul", 3000, "Admin"));
        hashSet2.add(new Employee("Peter", 4000, "IT"));
        hashSet2.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> myList2 = new ArrayList<>(hashSet2);
        Collections.sort(myList2);
        System.out.println(myList2);
    }
}
