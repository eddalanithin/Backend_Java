package Arrays;

import java.util.Scanner;

public class MinpairprodCOMposandneg {
    static long MinPairPRODUCT(int[] ar){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) {
                secondmax=max;
                max=ar[i];
            }else if(ar[i]>secondmax) {
                secondmax=ar[i];
            }
        }
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min) {
                secondmin=min;
                min=ar[i];
            }else if(ar[i]<secondmin) {
                secondmin=ar[i];
            }
        }
        int p1=secondmax*max;
        int p2=min*secondmin;
        int p3=max*min;
        int smallestamongall=0;
        if(p1<p2 && p1<p3){
            smallestamongall=p1;
        } else if (p2<p1&&p2<p3) {
            smallestamongall=p2;
        } else if (p3<p1&&p3<p2) {
            smallestamongall=p3;
        }
        return smallestamongall;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar = new int[num];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        long res= MinPairPRODUCT(ar);
System.out.println(res);

    }
}
