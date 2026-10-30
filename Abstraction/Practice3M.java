package com.Abstraction;

public class Practice3M {
//    Create an abstract class named TransportService.
//    Add a constructor that prints a message when it executes.
//    Declare an abstract method calculateFare() returning int.
//    Add a concrete method showService() that prints a service message.
//    Create a concrete subclass named MetroService and implement calculateFare().
//    In main(), create a MetroService object, call both methods, and
//        observe the order of the constructor and method outputs.
//    Explain why the abstract class's constructor executes even though you cannot
//        instantiate the abstract class directly.
    public static void main(String[] args) {
        MetroService m=new MetroService();
        m.showService();
        System.out.println(m.calculateFare());
    }
}
abstract class TransportService{
    public TransportService(){
        System.out.println("Creating a Transport Service using  constructor");
    }
    abstract int calculateFare();
    void showService(){
        System.out.println("Service is running");
    }
}
class MetroService extends TransportService{
    @Override
    public int calculateFare() {
       return 2000;
    }
}

