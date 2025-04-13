package com.oops.Singleton;

public class Singleton {
    // there are senerios when we need to create only one instance of the class. those are called Singleton class
    // to do this we dont allow people to call the constructor of the class as it will be used to create new objects of the Class.

    private Singleton(){
        // it will be accesable to this class only.

    }
    public static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
