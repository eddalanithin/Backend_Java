package Arrays;

import java.util.Scanner;

public class Arraypairdiffer {
    static void printArrayPairDiffer(int[] ar,int num){
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]-ar[j]==num ||ar[j]-ar[i]==num) {
                    System.out.print("[" + ar[i] + "," + ar[j] + "]");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("enter the which should be equal :");
        int num=sc.nextInt();
        System.out.println("enter array elements :");
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        printArrayPairDiffer(ar,num);

    }
}
