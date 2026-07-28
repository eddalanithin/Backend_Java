package Arrays;

import java.util.Scanner;

public class Consecutivesubarrays {
    static  void printConsecutiveSubarrays(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            if((ar[i]+1)==ar[i+1]){
                System.out.print(ar[i]+" ");
            }else {
                System.out.print(ar[i]+" ");
                System.out.println();
            }

       }
        System.out.print(ar[ar.length-1]);
    }
    public static  void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int szArray=sc.nextInt();
        //  System.out.println("Enter the subarray size of array: ");
        // int size=sc.nextInt();
        // System.out.println("Enter k Value: ");
        // int k=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] ar=new int[szArray];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        printConsecutiveSubarrays(ar);
    }
}
