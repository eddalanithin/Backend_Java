package Arrays;

import java.util.Scanner;

public class Reversesubwithsum {
    static  void PrintReverseSubSizewithk(int[] ar,int k){
        for(int size=ar.length;size>=1;size--){
            for(int i=0;i<=ar.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+ar[j];
                }
                if(sum==k){
                    for(int j=i;j<i+size;j++){
                       System.out.print(ar[j]+" ");
                    }
                    System.out.println();
                    break;
                }
            }
        }

    }
    public static  void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int szArray=sc.nextInt();
        //  System.out.println("Enter the subarray size of array: ");
        // int size=sc.nextInt();
        System.out.println("Enter k Value: ");
        int k=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] ar=new int[szArray];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        PrintReverseSubSizewithk(ar,k);
    }
}
