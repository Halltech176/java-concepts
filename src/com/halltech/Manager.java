package com.halltech;

public class Manager extends  Employee{
    private int teamSize;
    public Manager(
            String name, int age, String experience, String address
    ){
        super(name, age, experience, address);
    }
    public void report(){
        System.out.println("Manager wrting reports");
    }




}
