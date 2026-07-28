package Arrays;

import java.util.Scanner;

public class FindindMissingnum {

    static void printMissingnum(int[] ar){
    int sum1=0;
    int sum2=0;
    int max=Integer.MIN_VALUE;
	for(int i=0;i<ar.length;i++){
        sum1=sum1+ar[i];
        if(ar[i]>max){
            max=ar[i];
        }
    }
    sum2=max*(max+1)/2;
        System.out.println(sum2-sum1);

}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array :");
    int size = sc.nextInt();
    System.out.println("enter array elements :");
    int[] ar = new int[size];
    for (int i = 0; i < ar.length; i++) {
        ar[i] = sc.nextInt();
    }
    printMissingnum(ar);
  }
}
