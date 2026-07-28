package Arrays;

import java.util.Scanner;

public class MaxvalueofIndex {
    static int  printMaxvaluofINDEX(int[] ar){
        int max=Integer.MIN_VALUE;
       int index=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
                index=i;
            }
        }
       return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] ar=new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
       int res= printMaxvaluofINDEX(ar);
        System.out.println(res);
    }
}
