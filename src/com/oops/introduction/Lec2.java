package com.oops.introduction;

/*
    * Wrapper class
    * Pass by reference and Pass by value
    * Integer -> final class
    * Final - use to prevent the modification of the content.
    * Garbage Collection - remove the values or variables not needed. but when this condition is hit. we need to implement a things to do what to do when object is destroyed but we cannot destroy the object.
    * finalize method (called when Java is doing garbage collection)
 */
public class Lec2 {
    public static void main(String[] args){
        // there is also a way to create using Wrapper Classes. to convert
        // primitive data types to objects

//        int a = 10;
//        int b = 20;

        Integer a = 10;
        Integer b = 20; // this is final so no swapping.

        Integer num = 45; // Object of type integer

        // "final" keyword
        // Integer wrapper class is final
        final int bonus = 34;
//        bonus = 55; will give an error
        System.out.println(bonus);

        swap(a,b);
        // this will not swap as in java we only have pass by value. no pass by reference. basically we have location to the reference of the variable but we dont have knowledge of the variable so we can swap it.
        /*
        * In pass-by-value, a copy of the argument's value is created when the method is called.
        * The method then works with this copy.
        * Any modifications to the copy within the method do not affect the original value outside the method.
        * Java always uses pass-by-value for primitives (e.g., int, boolean, char).
        * For objects, Java passes the reference to the object by value.
        * This means that when an object is passed to a method, a copy of the reference (which is the memory address of the object) is created.
        * Although the reference is copied, both the original reference and the copied reference point to the same object in memory.
        * Therefore, changes made to the object through the copied reference will be visible outside the method.
         */
        System.out.println(a + " " + b);
        final Stud student1 = new Stud("Naveen");

        // here we can change the value of the object student1 but the reference is immutable of the String Naveen
        System.out.println(student1.name);
        student1.name = "Raghav"; // this will change the value of the final string
        // when a non primitive is fina you cannot reassign it but you can change the value of it
//        student1 = new Stud("Other object") // reassignment is not allowed. reassign means changing the reference.
        System.out.println(student1.name);

    }
    static void swap(Integer a, Integer  b){
        // we are swapping the copy of the values of a and b and these are just within the scope of this function. so these copies will get destroyed after the function is executed with no effect on the original
        // if we use Wrapper Class this will not swap either due to final class.
        int temp = a;
        a = b;
        b = temp;
    }
    Stud obj;
//    for (int i  = 0; i < 10000000000; i++)
//    {
//        // if it loops at small vale then no garbage collection will take place so we need to put strain on it by making the number large enough so it destroy objects.
//        obj = new Stud("random name");
////      obj.finalize // we cannot do this manually. this is raising an exception.
//        // Exception handling
//    }
}

class A{
    String name;
}

class Stud{
    //    final int num; // this will give error as final variables need to be initialized while declaring it.
    // tis provides immutablity to the primitive data types. and when final is used in the context of the non primitives like object then the reference variable store it cannot change but the value that reference variable is pointing to can change.
    // if I declared it with the Student class name it will show duplicate as the package com.oops.introduction is alos being imported. so it has Student from the Main file.
    final int num = 455; // this value is immutable as primitive.
    String name;
    public Stud(String name){
        this.name = name;
    }

//    protected void finalize() throw Throwable{
//        // whenever any thing from class Stud is freed from memory then java will call this finalized.
//        System.out.println("Object is destroyed");
//    }
}