package com.halltech.person;

import com.halltech.cat.Cat;

import java.util.Arrays;

public class Person {

    public static  int count = 0;

//    static initializer
    static  {
        System.out.println("the start of static initialization");
        System.out.println("The end of static initialization");
    }
//    instance initializer
{
    count++;
}

   private String firstName;
    private  String lastName;
    private Gender gender;
    private Cat[] cats;

    public Person(String firstName, String lastName, Gender gender, Cat[] cats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }
}
