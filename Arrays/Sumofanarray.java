package Arrays;

import java.util.Scanner;

public class Sumofanarray {
    static int sumOfanARRAY(int[] ar){

       int temp=0;
        for(int i=0;i<ar.length;i++){
             temp=ar[i]+temp;
        }
        return temp;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[]ar= new int[num];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
       int res= sumOfanARRAY(ar);
        System.out.print(res);
    }
}
