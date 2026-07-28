package Arrays;

import java.util.Scanner;

public class RepeatedElem {
    static void printRepEle(int[] ar1, int[] ar2) {
       int i=0,j=0;
       while(i<ar1.length&&j< ar2.length){
           if(ar1[i]==ar2[j]){
               System.out.print(ar1[i]+" ");
               i++;
               j++;
           }else if(ar1[i]>ar2[j]){
               j++;
           }else{
               i++;
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of 1st array :");
        int size = sc.nextInt();
        System.out.println("enter 1st array elements :");
        int[] ar1 = new int[size];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("enter the size of 2nd array :");
        int size2 = sc.nextInt();
        System.out.println("enter 2nd array elements :");
        int[] ar2 = new int[size2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = sc.nextInt();
        }
        printRepEle(ar1, ar2);

    }
}
