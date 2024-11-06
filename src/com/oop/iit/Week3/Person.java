package com.oop.iit.Week3;

public class Person {
    private String name;
    private String dob;

    //Default Constructor
    public Person(){
        super(); // Super keyword calls the default constructor of the parent class we use it as a practice
        this.name = "John Doe";
        this.dob = "1st April";
    }

    /* Constructor for initializing objects
    * @param name - name of the person
    * @param dob of the person
    * */

    public Person(String name, String dob){
        // this keyword is specifically used to address the instance variables
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
    /*
    * Walk method
    * Talk method
    * */

    public void walk(){
        System.out.println(this.name + " is walking...");
    }

    public void talk(){
        System.out.println(this.name + " is talking...");

    }
}
