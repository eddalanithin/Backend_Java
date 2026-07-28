package Arrays;

import java.util.Scanner;

public class FindMissinginRange {
    static void printMissingnum(int[] ar){
        int sum1=0;
        int sum2=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            sum1=sum1+ar[i];
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        for(int i=min;i<=max;i++){
            sum2=i+sum2;
        }
        System.out.println(sum2-sum1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("enter array elements :");
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        printMissingnum(ar);
    }
}
