package com.oops.properties.Abstraction;

public abstract class Son extends Parent{
    @Override
    void career(){
        System.out.println("I am going to be a ");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love ");
    }
}

