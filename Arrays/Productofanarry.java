package Arrays;

import java.util.Scanner;

public class Productofanarry {
     static long productOfanARRAY(int[] ar){
         long prod=1;
         for(int i=0;i<ar.length;i++){
             prod=prod*ar[i];
         }
         return prod;
     }
     public static  void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int[] ar=new int[num];
         for(int i=0;i<ar.length;i++){
             ar[i]=sc.nextInt();
         }
         long res=productOfanARRAY(ar);
         System.out.print(res);
     }
}
