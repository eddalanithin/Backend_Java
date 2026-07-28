package Arrays;

import java.util.Scanner;

public class Mering2arrays {
    static void printMergeEle(int[] ar1, int[] ar2) {
        //int [] res=new int[ar1[ar1.length]+ar2[ar2.length]];
        int i=0,j=0,k=0;
        while(i<ar1.length&&j< ar2.length){
            if(ar2[j]<=ar1[i]){
                System.out.println(ar2[j]+" ");
                j++;
                //k++;

            }else {
                System.out.println(ar1[i]+" ");
                i++;
                //k++;
            }
        }
        while(j< ar2.length){
            System.out.println(ar2[j]+" ");
            j++;
            //k++;
        }
       /* for(int q=0;i<res.length;q++){
            System.out.println(res[i]);
        } */
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
        printMergeEle(ar1, ar2);

    }
}
