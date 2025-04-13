package com.oops.properties.Inheritance;

class Box {
    double l;
    double h;
    double w;
    //private double x; // if anything is priviate we can only use that in that file only.
    double weigt = 5;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }
}
