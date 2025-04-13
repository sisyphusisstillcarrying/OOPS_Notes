package com.oops.properties.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -2;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // to have these parameters tweeked from here we need to have to go to the Parent/Base class and access their Constructor. and super will call the parent class constructor Box()
        // used to initialize value in parent class
        // this will work even if a property os private as super is calling the Box Class Constructor and that constructor can use the private class as it is in that file.
        // inhertiance flow form base to derived not other way around
        this.weight = weight;

        // super has 2 use cases. if we have heirarchy of A -> B -> C then if we call super in C we get B and in B we get A. and even if we call it in A then we still dont get error as it calls the Object class and every class has object as its super class. 
    }

}
