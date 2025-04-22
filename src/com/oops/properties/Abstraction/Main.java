package com.oops.properties.Abstraction;

public class Main {
    public static void main(String[] args){
        Son son = new Son();
        son.career();

        Daughter daughter = new Daughter();
        daughter.career();

        // you cannot create a method or object of the abstract class.
        // we cannot create abstract constructors.
    }
}
