package com.Abstraction;

public class Pracitce2E {
//    Create an abstract class named PaymentGateway.
//    Declare an abstract method processPayment() that returns double.
//    Add a concrete method displayMessage() that prints a general payment message.
//    Create a class named OnlineGateway that extends PaymentGateway.
//    Implement processPayment() so it returns a numeric value.
//    In main(), create an OnlineGateway object, call both methods, and print the returned value.
//    Explain why PaymentGateway itself cannot be instantiated directly.
   public static void main(String[] args) {
       OnlineGateway onlineGateway=new OnlineGateway();
       onlineGateway.displayMessage();
       System.out.println(onlineGateway.processPayment());

   }
}
abstract class PaymentGateWay{
    abstract double processPayment();
    void displayMessage(){
        System.out.println("Welcome to the Payment Gate Way");

    }
}
class OnlineGateway extends PaymentGateWay{
    double processPayment(){
        return 67890.0;
    }
}