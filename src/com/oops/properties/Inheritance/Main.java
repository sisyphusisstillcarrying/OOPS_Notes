package com.oops.properties.Inheritance;

public class Main {
    public static void main(String[] args){
//        Child child = new Child();
        // whenever we call constructor like (Child()) this we need to initialze the Parent Class variable also

        Box box1 = new Box();
        Box box2 = new Box(box1); // copies the old and paste in box2
        // this will call Box Constructor with no parameter
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);

        BoxWeight box4 = new BoxWeight();

        //Reference_Variable name = new Object(paramereter)
        // the type of reference variable not the type of Object decides what type of memebers can be accessed.
        // reference variable is parent so it cannot call weight which is property of Child BoxWeight
        Box box5 = new BoxWeight(2,4,5,6);
        // when a subclass object (BOxWeight) us referenced by a Super Class variable then we can access only things which are declared by the super keyword.
        System.out.println(box5.w);
        System.out.println();

        // but a child cannot refer to a parent like BoxWeight box6 = new Box(4,5,6)
        // BoxWeight is assumed to be a subclass of Box.But here, you're assigning a parent object (Box) to a child reference (BoxWeight), which is not allowed.
        // This is called "downcasting without a cast", and Java doesn't allow it implicitly.
        /*
        * If your reference type is BoxWeight, you're allowed to access weight.
        * But if you construct a Box, there’s no weight field, so it's invalid.
        * Object type must match or be a subtype of reference type.
        */
        // BoxWeight box6 = new Box(4,5,6)

    }
}
