package com.oops.properties.Abstraction;

abstract class Daughter extends Parent{
    @Override
    void career(){
        System.out.println("I am going to be a ");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love ");
    }
}