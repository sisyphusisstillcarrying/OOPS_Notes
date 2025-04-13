package com.oops.naveen.static_Example;

public class InnerClasses { // outside classes cannot be static. only inner class can be static. because it itself is not dependent on any other class.
    static class Test{ // this inncer class can be static or non static
        // static method and variables are Class level methods they are resolved during the complie time. as object and instances are created at runtime.
        String name;

        public Test(String name){
            this.name = name;
        }
        // we can also override the static methods that have been inherited we will cover this later.
        @Override // this is basically an annotation.
        public String toString(){ // this will be called from the internal working fo the println method rahter than the inbuild toString which produced the hashvalues
            return name;

        }

    }

    public static void main(String[] args){
        Test a = new Test("Naveen"); // these 2 lines will get an error because cannot be referenced from a static constant. as the Test itself is dependent on an outer Class InnerClasses so it cannot create object for it as with all the InnerClasses Test is made but if we put Test outside then there is no other. another thing which we can do is use static keyword. the reason is if we declare it inside with static keyword then it is not dependent on it. and if we move it outside then again it is not dependent on the outter class.
        // the inner class is not dependent on the objects of the Outter Class not the outter class
        Test b = new Test("Ram");
        // . binds the instance variables and instance methods with the reference variables.

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);

    }
}
//static class A{
//
//}