package com.halltech;
//
//import com.halltech.cat.Cat;
//import com.halltech.person.Gender;
//import com.halltech.person.Person;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        Cat cat = new Cat("Cattie..", 20);
//        Cat bard = new Cat("Cattie..", 20);
//        Cat[] cats = {cat, bard};
//
//        Person person1 = new Person("Olajide","Ayomide", Gender.MALE, cats );
//        Person person2 = new Person("Olajide","Precious",Gender.FEMALE, cats );
//
//        System.out.println(Person.count);

//        BankAccount account = new BankAccount("Olajide", BigDecimal.TEN, false);
//        System.out.println(account.withdraw( new BigDecimal("1.0")));
//        System.out.println(account.getBalance());

//        Programmer java = new Programmer("Ayomide", 40, "Bunvi", "Fullstack");
//        System.out.println(java);
//        java.sayHI();

        Animal dog = new Dog("Bingo");
        Animal cat = new Cat("Goongo");

        Animal[] animals = {dog, cat};

        for(Animal animal : animals) {
            animal.makeSound();
        }

    }
}