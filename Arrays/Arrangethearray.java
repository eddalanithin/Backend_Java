package Arrays;

import java.util.Scanner;

public class Arrangethearray {
    static void printtheArrangedarray(int[]ar){
        int i=ar.length-1;int j=ar.length-1;
        while(i>=0) {
            if (ar[i] == -1) {
                i--;
            } else {
                ar[j] = ar[i];
                i--;
                j--;
            }
        }
            while(j>=0){
                ar[j]=-1;
                j--;
            }
            for(int k=0;k<ar.length;k++){
                System.out.print(ar[k]+" ");
            }

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

       printtheArrangedarray(ar);
    }
}
