package com.Abstraction;

import java.util.Scanner;

public class Practice1E {
//    Create an abstract class named Appliance.
//    Declare an abstract method operate() with a void return type.
//    Add a concrete method showBrand() that prints a brand message.
//    Create a concrete class named WashingMachine that extends Appliance.
//    Implement the operate() method to print an operating message.
//    In main(), create a WashingMachine object and call both methods.
    public static  void main(String args[]){
        WashingMachine wm=new WashingMachine();
        wm.operate();
        wm.showBrand();
    }
}
abstract class Apliance{
    abstract void operate();
    void showBrand(){
        System.out.println("Shows Brand ");
    }
}
class WashingMachine extends Apliance{
    void operate(){
        System.out.println("Washing Machine ");
    }
}