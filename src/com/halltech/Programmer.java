package com.halltech;

public class Programmer extends  Employee{
    private String[] programmingLanguages;
    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }


    public void writeSomeCode() {
        System.out.println("Writing somd code");
    }

    @Override
    public void sayHI() {
        System.out.println("Hello fro the progranner");
    }
}
