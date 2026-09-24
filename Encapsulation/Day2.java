package Encapsulation;

import java.util.Scanner;

public class Day2 {
    static class Car{
        private String carBrand;
         private String  carModel;
       private String carColor;
       private float carPrice;
       private float carMileage;
       public Car(String carBrand,String carModel,String carColor,float carPrice,float carMileage){
           this.carBrand=carBrand;
           this.carColor=carColor;
           this.carMileage=carMileage;
           this.carModel=carModel;
           this.carPrice=carPrice;
       }
       public String  carBrand(){
           return carBrand;
       }
       public String carModel(){
           return carModel;
       }
       public String carColor(){
           return carColor;
       }
       public float carPrice(){
           return carPrice;
        }
        public float carMileage(){
           return carMileage;
        }
    }
    public  static  void main(String[] args){
       Scanner scan=new Scanner(System.in);
        Car c1=new Car(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextFloat(), scan.nextFloat());
        System.out.println(c1.carBrand());
        System.out.println(c1.carColor());
        System.out.println(c1.carModel());
        System.out.println(c1.carPrice());
        System.out.println(c1.carMileage());
    }
}
