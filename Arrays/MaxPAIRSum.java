package Arrays;

import java.util.Scanner;

public class MaxPAIRSum {
    static long MaxPairSum(int[] ar){
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
         return secondmax+max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar = new int[num];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
       long res = MaxPairSum(ar);

        System.out.print(res);
    }
}
