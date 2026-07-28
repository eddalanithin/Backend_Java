package Arrays;

import java.util.Scanner;

public class Maximumofanarray {
   static void printMaxinARRAY(int[] ar){
        int max=Integer.MIN_VALUE;
        /* we can also use "int max=ar[0];" but incase the interviewer ask
         without this how can you solve? so, then we have to use wrapper class */
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ar=new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        printMaxinARRAY(ar);
    }
}
