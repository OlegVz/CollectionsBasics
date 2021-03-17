package com.hybris.internship.lesson3;

import java.util.Objects;

public class Animal {

    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Animal other = (Animal) obj;

        if (!Objects.equals(age, other.age)) {
            return false;
        }

        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }
}
