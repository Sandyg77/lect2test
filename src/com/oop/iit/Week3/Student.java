package com.oop.iit.Week3;

public class Student extends Person {
    private int studentId;

    public Student(int studentId ){
        this.studentId = studentId;
    }

    public Student (String name, String dob, int studentId){
        super(name, dob);
        this.studentId =studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void walk() {
        System.out.println(getName() + " who is a student is walking");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " who is a student is talking");

    }
}
