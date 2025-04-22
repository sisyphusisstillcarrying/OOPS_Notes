package com.oops.properties.Abstraction;

public abstract class Parent {
    abstract void career();
    abstract void partner();

    // if function need to be overriden then declare them abstract.
    // Abstraction
    // through abstract classes we can have multipe inheritance
    // it is used when we want to know what to do but not how to do it.
    // parent class will give us abody but not the implementation
    // it does not have a body it depends on child class for the body. overriding.
    // we need to ensure that child override all the essentil methods. child class must override them

    // any class which contains one or more abstract method it should also be declared as abstract.
}


