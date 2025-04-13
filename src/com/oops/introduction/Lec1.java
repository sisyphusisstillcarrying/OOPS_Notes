// Constructor This Object Class New Student() Constructor Overloading
package com.oops.introduction;

public class Lec1 {
    public static void main(String[] args) {


        // we are given a task to store the roll no of 5 students
        // lets see how we can do that

    //    int[] numbers = new int[5];
    //
    //    // then you are asked to store 5 names
    //    String[] names = new String[5];
    //
    //    // then we are asked to store data od 5 students (roll no, name, marks)
    //    int[] rollno = new int[5];
    //    String[] name = new String[5];
    //    float[] marks = new float[5];
        /*
        we just store all the properties individually
        but the interviewer wants it in one data structure like a unit
         */
        // he wants a data strucuture where all three things exists

        Student student1; // declared and it exists in stack (complie time)
        student1 =new Student(); // this new does dynamically allocates memory at run time
        // and returns a reference to it. Student() is a by default constructor. this is done by java
        student1.rollno =5;
        student1.changeName("Raghav");
        student1.greetings();
        System.out.println(student1.marks);

        // to call the constructor we need to put parameter otherwise it will only call the
        // default paramenter
        Student randomStudent = new Student(55,"Naman",14,54);
        System.out.println(randomStudent.name);

        // to call the Object which is pointing to another object.
        Student random = new Student(student1);
        System.out.println(random.name); // return Raghav as we change the name of
        // the student1 name

        Student random2 = new Student();
        System.out.println(random2.name); // return default as default java constructor will be overloaded

        Student one = new Student();
        Student two = one; // this point to the whole of one's object

        one.name = "somethingsomething";
        System.out.println(two.name);
    }
}
// A class is a named group of properties and function.
// by convention class starts with a captial letter. we are creating out own DS

// create a Class.
// A Class is basically a template over which we can make objects.
// for eg. Car is a Class but we have many
// brands that make care which are basically objects with specific details
// different cars have same properties but different values. these individual
// cars are objects which exist physically
// Class is an idea/logical construct but no phyisical memory but a template
// Class is an template of an object
// Object is an instance of the class. it has a phyisical memory allocation.
// Object are categories by 3 things state of the object, identity of the object and behavior of the object
// Object are stored in heap and reference is stacked in Stack memory
// new keyword is used to make the instance of the Class. Classes are like datatype
// we use dot operator

class Student{
    // for every single student
    int rollno; // default is 0
    String name; // default is null
    int age;
    float marks; // if we put values here then they are default values.
    // otherwise default value of fload is 0.0


    // constructor is introduced as we wont be writing the same redundent info again and again
    // constructor define what will happen when the object will be created
    // put values instantiate. Student() is a constructor which is a special type of function in class
    // bind these arguments with the object.
    // constructor dont have a return type.
//    Student(){
//        // this keyword. we need a way to add the values of the above
//        // properties object by object
//        this.rollno = 12;
//        this.name = "Naveen";
//        this.marks = 23;
//    }
    Student(int rollno, String name, int umar, float marks) {
        // another great use case of this as otherwise complier wont know what values are of the
        // variables and what of the functional constructor
        this.rollno = rollno;
        this.name = name;
        this.age = umar; // we can also name the variable differently
        this.marks = marks;

        // if we dont use the this keywords words or variable on both sides
        // need to be different
    }
    // another use case of the this keyword is when we are refering to different things
    // when the 2 different instanced of the object have same variable.
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.age = other.age; // we can also name the variable differently
        this.marks = other.marks;
    }

    // this help us to call one constructor from another constructor.
    Student(){
        // this is how you call a constructor from another constructor
        this (54,"default", 00, 100);
        // here this will be replaced with the Class name Student. until now we have seen it being replaced with objects but it is also possible. internally it is Student() this is used to pass some default items.
        // this does constructor overloading of the default java constructor.
    }
    void greetings(){
        System.out.println("Hellp! My name is " + name);
        // this when called will print Hellp my name is Naveen. this will print Naveen
        // with or without the this keyword like this.name as by default when we call
        //student1.greetings() it will place a this keyword and thi keyword will refer to
        // the constructor and return this.name

    }

    void changeName(String newName){
        name = newName; // this will change the name in the memory
    }
}

/*
    why we dont use the new keyword for the primitive data types like char int boolean etc. because primitive datatypes are not declared as object therefore they are stored in the Stack. object are stored in Heap memory. this is done to improve the efficiency.
    New is used to allocate memory to the heap.
    Student one = new Student();
    Student two = one; // this points to the same object as in one as there is no seperate memory allocated to it so changes made to two will be changes made to one.

 */
