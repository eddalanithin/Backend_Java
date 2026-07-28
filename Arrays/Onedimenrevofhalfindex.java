package Arrays;

import java.util.Scanner;

public class Onedimenrevofhalfindex {
   static void printRevOfHalfIndex(int num, Scanner sc){
        int[] ar=new int[num];
        int i;
        for(i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(i=ar.length-1;i>=ar.length/2;i--){
            System.out.print(ar[i]+" ");
        }
    }
    public static  void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int num= sc.nextInt();
       printRevOfHalfIndex(num,sc);
   }
}
