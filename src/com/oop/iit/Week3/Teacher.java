package com.oop.iit.Week3;
// Inheriting from the person class
public class Teacher extends Person {
    private double salary;
    // Using the final keyword - week4
    public static final String CLASS_NAME = "Teacher";


    /*Constructor for the teacher class
    * @param name - name of the teacher
    * @param dob -  dob of thr teacher
    * @param salary -  monthly salary
    * */

    public Teacher(String name, String dob,double salary){
        // Super method initialize the name and dob
        super(name, dob);
        this.salary = salary;

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Teacher {" + "name: " + getName() + " dob: " + getDob() + " salary: " + salary + "}" ;
    }

    @Override
    public void talk() {
        System.out.println(getName() + "who is a teacher is talking");
    }
// Override is an annotation -its not mandatory but as a practice use it (for overriding the method signature should be the same.)
    @Override
    public void walk() {
        System.out.println(getName() + "who is a teacher is walking");

    }
}
