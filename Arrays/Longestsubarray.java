package Arrays;

import java.util.Scanner;

public class Longestsubarray {
    static void PrintLongestSubarray(int[] ar){
        int count=0,max=0,startingIndex=0,endingIndex=0;
        for(int i=0;i<ar.length-1;i++) {
            if (ar[i + 1] - ar[i] == 1) {
                count++;
            } else {
                count++;
                if (count > max) {
                    max = count;
                    endingIndex=i;
                }
                count = 0;
            }
        }
        count++;
        if(count>max) {
            max = count;
            endingIndex = ar.length - 1;
        }
        startingIndex=endingIndex-max+1;
            for(int i=startingIndex;i<=endingIndex;i++) {
                System.out.print(ar[i]+" ");
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

        PrintLongestSubarray(ar);
    }
}
