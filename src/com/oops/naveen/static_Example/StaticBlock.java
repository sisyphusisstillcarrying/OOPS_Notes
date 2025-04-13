package com.oops.naveen.static_Example;

// this is a demo to show initialisation of static variables.
public class StaticBlock {
    static int a = 4;
    static int b;

    // we want to initialize out static variables. we can do this using static block and that static block will be executed exactly once when the first instance of the Class is first loaded
    static { // this is a static block
        System.out.println("I am in static block");
        b = a * 5;
        // this only runs once when the first object is created i.e when the class is loaded for the first time.
    }

    public static void main(String[] args){
        StaticBlock obj = new StaticBlock(); // this will print the static block print statement.
        // when this object is loaded all the static variable/method inside it runs.
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;
        StaticBlock obj2 = new StaticBlock(); // this wont again print what inside static block as it runs exactly once.
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // value o
    }
}
