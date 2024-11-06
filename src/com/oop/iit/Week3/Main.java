package com.oop.iit.Week3;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("John Doe", "1st April", 25000);
        Student student = new Student("Mike", "2nd May", 258035);
        Teacher teacher1 = (Teacher) teacher;
        System.out.println(teacher1);
        System.out.println(teacher.toString());

        if(teacher instanceof Teacher){
            Teacher teacher2 = (Teacher) teacher;
            teacher2.getSalary();
        }

         /*
           Naming Conventions
        * lowerCamelCase - for naming variables (java)
        * UpperCamelCase - for naming class names (java)
        * snake_case - used in python not in java
        * SCREAMING_CASE - used in java for constants when using final keyword (java)
        * kebab-case - used in web development
        */

        System.out.println(Teacher.CLASS_NAME);

        teacher.walk();
        teacher.talk();

        student.walk();
        student.talk();

    }
}
