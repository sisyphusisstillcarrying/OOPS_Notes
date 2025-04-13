//package com.oops.naveen.static_Example;
////import static com.oops.naveen.package_b;
//
//public class Main {
//    public static void main(String[] args){
//        /*
//            why do we use static in main ?
//            static means we can use this method/function main without declaring or making instance of this class and main is the entry point to the .java file/program. so we cannot create object as main needs to run first and thats why it need to be static.
//
//            Static belongs to the Class not the object
//
//        */
////        Human naveen = new Human(22,false,"Naveen",100000);
////        System.out.println(naveen.population); // will work but dont use refer          human for documentation'
//
//        greeting(); // we cannot call a non static method inside a static method as the greeting is declared as void greeting()
//
//        // we can access them without declaring the class (Human naveen = new Human(22,false,"Naveen",100000);)
//
//        // we cannot access non static stuff without referencing their instances in a static context. either they become static or are ran as object of Main or Class
//        Main obj = new Main();
//        obj.greeting();
//
//    }
//    // this is not dependent on objects
//    static void fun(){
////        greeting(); // we cannot call this here as non static in static. we cannot use this becaouse it requries an instances but the function you are using it in doesnot depend on instances
//    }
//
//    void fun2(){
//        greetings(); // we dont need to create an object for this in nonstatic method as the object for fun2 will eventually be created. but will have to create object for the static methods.
//        // greeting will use the fun2's object as it is also non static.
//    }
//    // we know something which is not static belongs to a object. it is meaningless as we have not declared a Class of which this is instance of.
//    // this is dependent on objects
//    void greeting(){
//        fun(); // but we can have other way around. we can have static member in nonstatic method. but in static there is no creation of object in static method therefore cannot contain nonstatic things
//        System.out.println("hellow static")
//    }
//}
