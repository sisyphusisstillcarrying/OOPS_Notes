package com.oops.properties.Inheritance;

public class Parent { // traints which can be passed to children and children can use those things. THis is Base Class and Child Class is Derived Class
    String title;
    int weight;

}

class Child extends Parent {
    // Child Class is inheriting propertie from the base class.
    // to incoperate Parents to Child we use extends keyword.
    // so if we refer to a property first it will be checked in Child as there can be a case of override but if not then we look for it in the Parent Class.
    // Child class means it will have properties of base class and it will also have properties of its own.
    int l;
    int w;
    int h;

}
