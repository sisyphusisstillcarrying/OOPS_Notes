//// Packages are containors/ boxes for classes so basically compartments for classes. Package is just a folder so basically in the com folder there is an oops folder. it is written as com.oops.introduction as there is no other branches to spread so it is appended in one line otherwise it will strea as com -> oops -> different folders. we use packages so we can have same named function in different packages and import whichever we need and they dont conflict with their own scope.
//package com.oops.naveen.package_a; // this writes in which folder this file lies for the complier. generally convention is writting the URL of a company in reverese.
//
//import static com.oops.naveen.package_b.Message.message; // this is importing message method from Message class from package_b package. and the import will give error without static. The static keyword is required in this case because you're trying to import a static member (a field or method) from a class. Because static import only works for static members.
//
//import com.oops.naveen.package_b.Race;
//public class greeting {
//    public static void main(String[] args){
//        message();
//    }
//}
