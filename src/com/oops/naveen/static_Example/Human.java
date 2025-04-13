package com.oops.naveen.static_Example;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // what if there was a property that was common to everyone. it is object independent
    // these are called Static methods or static variable
    static long population;

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // we cannot use this inside static. this represent an object. therefore cannot be used

    }

    public Human(int age, boolean married, String name, int salary,long population) {
        this.age = age;
        this.married = married;
        this.name = name;
        this.salary = salary;
        Human.population = +1; // to access the Static variable we will use the class name.
        // therefore instead of this we will use Human as it is independent of the instance or object.
        // here both the this and Class keyword both will work as first it will look for the variable in naveen but it doesnt exists. so it will move up to the Human class and there it will find the static variable population and as static is common for all the objects it will use that value. this is the logic for why we dont get error but this is not good practice.
        // when operating on a static use Class name
        // we can access them without declaring the class
        // we can also declare static methods
    }
}
