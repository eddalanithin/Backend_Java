package Arrays;

import java.util.Scanner;

public class Subarrays {
        static void printSubarrys(int [] ar,int size){

            for(int i=0;i<=ar.length-size;i++){
                for(int j=i;j<i+size;j++){
                    System.out.print(ar[j]+" ");
                }
                System.out.println();
            }
        }
        public static  void main (String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int szArray=sc.nextInt();
            System.out.println("Enter the subarray size of array: ");
            int size=sc.nextInt();
            System.out.println("Enter the array: ");
            int[] ar=new int[szArray];

            for(int i=0;i<ar.length;i++){
                ar[i]=sc.nextInt();
            }

            printSubarrys(ar,size);
        }
}
