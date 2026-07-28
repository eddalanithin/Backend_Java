package Arrays;

import java.util.Scanner;

public class Secondmax {
    static int secondMAX(int[] ar){
        int max=Integer.MIN_VALUE;
        int secondmax=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) {
                secondmax=max;
                max=ar[i];
                }else if(ar[i]>secondmax) {
                secondmax=ar[i];
            }
        }
        return secondmax;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ar=new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int res=secondMAX(ar);
        System.out.print(res);
    }
}
