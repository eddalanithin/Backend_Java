package Arrays;

import java.util.Scanner;

public class Maxrepeatedelement {
    static int maxRepeatedElement(int[] ar){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) {
                max = ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(max==ar[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int res=maxRepeatedElement(ar);
        System.out.println(res);
    }
}
