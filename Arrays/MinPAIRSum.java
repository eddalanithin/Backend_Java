package Arrays;

import java.util.Scanner;

public class MinPAIRSum {
    static long MinPairSum(int[] ar){
        int min=Integer.MAX_VALUE;
        int secondmin=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min) {
                secondmin=min;
                min=ar[i];
            }else if(ar[i]<secondmin) {
                secondmin=ar[i];
            }
        }
         return secondmin+min;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar = new int[num];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        long res = MinPairSum(ar);

        System.out.print(res);
    }
}

