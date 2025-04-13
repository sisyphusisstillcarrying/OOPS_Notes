//// Packages are containors/ boxes for classes so basically compartments for classes. Package is just a folder so basically in the com folder there is an oops folder. it is written as com.oops.introduction as there is no other branches to spread so it is appended in one line otherwise it will strea as com -> oops -> different folders. we use packages so we can have same named function in different packages and import whichever we need and they dont conflict with their own scope. they are stored in heirarchical manner. it handles visiblilty.
//
//// all the folders in naveen are from this lecture
//
//import java.util.ArrayList; // this has the same strucutre of storing these are packages as well
//package com.oops.introduction; // this writes in which folder this file lies for the complier.
//// video 2 of playlist start here
///*
//   * printing an object
//   * Syso -> toString
//   * what are packages
//   * Static (talk about this in Human and Main in static_Examples)
// */
//public class Lec3 {
//     public static void main(String[] args){
//         // if we try print the object as it is
//         Random obj = new Random("Ram", 1);
//         System.out.println(obj);
//         // this is showing some random hash value com.oops.introduction.A@5f184fc6
//         // but we don't want this we want it to print the values
//         // so first we need to understand why this is happening. that is because println calls the toString function (obj.toString)by default but if the toString method doestn't exists then it will call the default toString which result in the com.oops.introduction.A@5f184fc6 value .so we need to override this.
//
//     }
//
//}
//
//class Random{
//    String name;
//    int rank;
//
//    Random(String name, int rank){
//        this.name = name;
//        this.rank = rank;
//    }
//
////    @override
//}
