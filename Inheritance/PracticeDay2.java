package com.OOPS;

import java.util.Scanner;

public class PracticeDay2 {
    public static void  main(String[] args){
        Scanner scan=new Scanner(System.in);
        Paymentsystem cc= new Creditcard();
        Paymentsystem upi=new Upi();
        Paymentsystem cash=new Cash();
        PaymentMethod ref=new PaymentMethod();
//       ref.paymentType(cc);
//       ref.paymentType(upi);
         ref.paymentType(cash);
         scan.close();
    }
}

abstract class Paymentsystem{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount)
    {
        if(amount>0) {
            this.amount = amount;
        }else{
            System.out.println("No negative payment");
            System.out.println("Balance: "+getAmount());
        }
    }

    abstract void userInput();
    abstract void paymentProcess();
    abstract void displayPaymentInfo();
}
class Creditcard extends Paymentsystem{
    private String holderName;
    private String cardNumber;

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void userInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Holder Name: ");
        setHolderName(scanner.nextLine());
        System.out.println("Enter the Card Number: ");
        setCardNumber(scanner.nextLine());
    }
    @Override
    void paymentProcess() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        setAmount(scanner.nextDouble());
        System.out.println("Credit card Payment is Processing");
    }
    @Override
    void displayPaymentInfo() {
        System.out.println("Credit Card payment method is Completed");
        System.out.println("Holder Name: "+getHolderName());
        System.out.println("Amount: "+getAmount());
    }
}
class Upi extends Paymentsystem{
    private String upiId;

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void userInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the UPI ID: ");
        setUpiId(scanner.nextLine());
    }

    @Override
    void paymentProcess() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        setAmount(scanner.nextDouble());
        System.out.println("UPI Payment is Processing");
    }

    @Override
    void displayPaymentInfo() {
        System.out.println("UPI payment method is Completed");
        System.out.println("UPI payment with Upi ID: "+getUpiId());
        System.out.println("Balance amount: "+getAmount());
    }
}
class Cash extends Paymentsystem{
    private long cashRecived;

    public long getCashRecived() {
        return cashRecived;
    }

    public void setCashRecived(long cashRecived) {
        if (cashRecived>0) {
            this.cashRecived = cashRecived;
        }else{
            System.out.println("Invalid amount");
        }
    }

    @Override
    void userInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Cash Recieved : ");
        setCashRecived(scanner.nextLong());
    }

    @Override
    void paymentProcess() {
        setAmount(getCashRecived());
        System.out.println("cash Payment is Processing");

    }

    @Override
    void displayPaymentInfo() {
        System.out.println("Cash Recieved method is Completed");
        System.out.println("Cash Recived :"+getCashRecived());
        System.out.println("Balance amount: "+getAmount());
    }
}
class PaymentMethod{
    void paymentType(Paymentsystem ref){
        ref.userInput();
        ref.paymentProcess();
        ref.displayPaymentInfo();
    }
}
