package Arrays;

import java.util.Scanner;

public class Secondmin {
    static int SecondMIN(int[] ar){
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                secondmin=min;
                min=ar[i];
            } else if (ar[i]<secondmin) {
                secondmin=ar[i];
            }
        }
        return secondmin;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int res=SecondMIN(ar);
        System.out.println(res);
    }
}
