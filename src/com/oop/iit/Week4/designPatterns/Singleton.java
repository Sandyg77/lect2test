package com.oop.iit.Week4.designPatterns;

public class Singleton {
    // A single instance  of the object
    private static  Singleton instance;
    private String name;
    private String age;

    // Constructor is different in design patterns (not public and not initialized)
    private Singleton(){
      super();
    }

    /*
    *  get instance method for singleton class
    * @return singleton object
    * Scanner is also an example for singleton object
    * */

    // Checks whether static object has a value
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "Name ='" + name + '\'' +
                ", Age='" + age + '\'' +
                '}';
    }
}
