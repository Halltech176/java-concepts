package com.halltech.cat;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public  Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void meow() {
        System.out.println(name + " mewo.....");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return  this.name;
    }
    @Override
    public String toString() {
        return "THe cat cat name is: " + name+ " and the cat is: " + age + " Years old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
