package Arrays;

import java.util.Scanner;

public class DuplicateelemenationSECMAX {
    static int duplicateEliminatesecmax(int[] ar){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                secondmax=max;
                max=ar[i];
            } else if (ar[i]>secondmax && ar[i]!=max) {
                secondmax=ar[i];
            }
        }
        return secondmax;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int res=duplicateEliminatesecmax(ar);
        System.out.println(res);
    }
}
