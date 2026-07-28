package Arrays;

import java.util.Scanner;

public class Rearrangethearray {
    static void Printrearragedarray(int[] ar) {
        int i = 0, j = 0;
        while (i < ar.length) {
            if (ar[i] != 0) {
                ar[j] = ar[i];
                i++;
                j++;
            } else {
                i++;
            }
        }
        while (j< ar.length) {
            ar[j] = 0;
            j++;
        }
        for(int k=0;k<ar.length;k++){
           System.out.print(ar[k]);
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

            Printrearragedarray(ar);
    }
}
