package Arrays;

import java.util.Scanner;

public class Maxminsum {
    static void MaxMinSum(int[] ar,int[] res) {
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        for(int i=0;i<res.length;i++){
            res[i]=sum-ar[i];
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<res.length;i++){
            if(res[i]>max){
                max=res[i];
            }else if (res[i]<min){
                min=res[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] ar=new int[size];
        int[] res=new int[size];
        for (int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        MaxMinSum(ar,res);
    }

}
