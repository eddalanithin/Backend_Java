package Arrays;

import java.util.Scanner;

public class CountSubarraywithsumk {
    static void printSubarryswithsumk(int [] ar,int size,int k){
        int count=0;
        for(int i=0;i<=ar.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
               sum=sum+ar[j];
            }
           if(sum==k){
               count++;
           }
        }
        System.out.println(count);
    }
    public static  void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int szArray=sc.nextInt();
        System.out.println("Enter the subarray size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter k Value: ");
        int k=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] ar=new int[szArray];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        printSubarryswithsumk(ar,size,k);
    }
}
