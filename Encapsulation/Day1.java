package Encapsulation;

import java.util.Scanner;

public class Day1 {
    public static class Dog{
        private String dogName;
        private String dogBreed;
        private int dogAge;
        private String  dogColor;
        private float dogWeight;
        public Dog(String dogName,String dogBreed,int dogAge,String dogColor,float dogWeight){
            this.dogName=dogName;
            this.dogAge=dogAge;
            this.dogBreed=dogBreed;
            this.dogColor=dogColor;
            this.dogWeight=dogWeight;
        }
        public String dogName(){
            return dogName;
        }
        public String dogBreed(){
            return dogBreed;
        }
        public int dogAge(){
            return dogAge;
        }
        public String dogColor(){
            return dogColor;
        }
        public float dogWeight(){
            return dogWeight;
        }

    }
    public  static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String dogName=scan.nextLine();
        String dogBreed=scan.nextLine();
        int dogAge=scan.nextInt();
        scan.nextLine();
        String dogColor=scan.nextLine();
        float dogWeight= scan.nextFloat();
        Dog d1=new Dog(dogName,dogBreed,dogAge,dogColor,dogWeight);
        System.out.println(d1.dogName);
        System.out.println(d1.dogBreed);
        System.out.println(d1.dogAge);
        System.out.println(d1.dogColor);
        System.out.println(d1.dogWeight);


    }

}
