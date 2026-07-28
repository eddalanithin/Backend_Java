package Arrays;

import java.util.Scanner;

public class Minimumofanarray {
    static int PrintMinimumOfARRAY(int[] ar){
        int min=Integer.MAX_VALUE;
        /* we can also use "int min=ar[0];" but incase the interviewer ask
         without this how can you solve? so, then we have to use wrapper class */
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ar=new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
       int res= PrintMinimumOfARRAY(ar);
       System.out.println(res);
    }
}
