package Arrays;

import java.util.Scanner;

public class ArraypairsumEvenORodd {
    static  void printArraypairSumEven(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%2==0){
                    System.out.print("["+ar[i]+","+ar[j]+"]");
                }
            }
            System.out.println();
        }
    }
 /*  static  void printArraypairSumOdd(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%2!=0){
                    System.out.print("["+ar[i]+","+ar[j]+"]");
                }
            }
            System.out.println();
        }
    } */
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("enter array elements :");
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        printArraypairSumEven(ar);
       // printArraypairSumOdd(ar);
    }
}
