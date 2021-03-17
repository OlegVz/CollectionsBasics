package com.hybris.internship.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i));
//        }
//
//        for (String value : animals) {
//            System.out.println(value);
//        }

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);

        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

//        for (Vehicle car : vehicles) {
//            System.out.println(car);
//        }

        printElements(vehicles);
        printElements(animals);
    }

    public static void printElements(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
